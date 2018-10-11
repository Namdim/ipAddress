import java.util.ArrayList;
import java.util.List;

public class IpValidator {

   private IpParser ipParser = new IpParser();
   private List<Integer> ipAddressesTmp = new ArrayList<Integer>();

    //Check limit part at 0, 255
    private boolean isLimitIdPart(Integer partId){
        if(partId >= 0 && partId <= 255) {
            return true;
        }
        else {
            return false;
        }
    }

    //check quantity parts in ip string
    //check every part to valid range
    public boolean isValidIpStr(String IpStr) {

        ipAddressesTmp = ipParser.get(IpStr);

        //if string has no validity quantity dots
        if(ipAddressesTmp.get(0)!=-1) {
            //if quanity parts !equals 4 ip string no validity
            if (ipAddressesTmp.size() == 4) {
                for (int i = 0; i < ipAddressesTmp.size(); i++) {
                    if (isLimitIdPart(ipAddressesTmp.get(i)) == false) {
                        System.out.println("Part " + ipAddressesTmp.get(i) + " out of range 0, 255");
                        return false;
                    }
                }
            } else {
                System.out.println("Quantity parts no validity =" + ipAddressesTmp.size());
                return false;
            }
        }
        else {return false;}

        return true;
    }
}
