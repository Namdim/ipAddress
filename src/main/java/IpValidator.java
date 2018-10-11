import java.util.ArrayList;

public class IpValidator {

   private IpParser ipParser = new IpParser();
   private ArrayList<Integer> ipAddressesTmp = new ArrayList<Integer>();


    //Определяем находится ли элемент 0, 255
    private boolean isLimitIdPart(Integer partId){
        if(partId>=0 && partId<=255)
            return true;
        else
            return  false;
    }

    //check quantity parts in ip string
    //check every part to valid range
    public boolean check(String IpStr) {

        ipAddressesTmp = ipParser.get(IpStr);

        //if string has no validity quantity dots
        if(ipAddressesTmp.get(0)!=-1) {
            //if quanity parts !equals 4 ip string no validity
            if (ipAddressesTmp.size() == 4) {
                for (int i = 0; i < ipAddressesTmp.size(); i++) {
                    if (isLimitIdPart(ipAddressesTmp.get(i)) == false) {
                        System.out.print("Part " + ipAddressesTmp.get(i) + "out of range 0, 255");
                        return false;
                    }
                }
            } else {
                System.out.print("Quantity parts no validity =" + ipAddressesTmp.size());
                return false;
            }
        }
        else return false;

        return true;
    }
}
