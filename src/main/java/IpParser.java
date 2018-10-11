import java.util.ArrayList;
//ArrayList<Integer>
public class IpParser {

    private ArrayList<Integer> IpPart = new ArrayList<Integer>();

    public ArrayList<Integer> get(String ipStr){
        IpPart.clear();

        String [] partStrId = ipStr.split("\\.");

        //Calculate quantity dots
        int countDot = ipStr.split("\\.",-1).length-1;


        if(countDot==3) {
            for (int i = 0; i < partStrId.length; i++) {
                try {
                    IpPart.add(Integer.parseInt(partStrId[i]));
                } catch (NumberFormatException e) {
                    System.out.print("IpAddress part " + i + " = " + partStrId[i] + " no validity \n");
                    IpPart.clear();
                    IpPart.add(-1);
                    break;
                }
            }
        }
        else{
            System.out.print("Ip string no validity\n");
            IpPart.clear();
            IpPart.add(-1);
        }
        return IpPart;
    }
}
