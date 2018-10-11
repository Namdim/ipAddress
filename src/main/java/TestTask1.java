import java.util.Scanner;

public class TestTask1 {
    public static void main(String[] args) {

        IpAddress ipAddress1 = new IpAddress();
        IpAddress ipAddress2 = new IpAddress();
        IpValidator validator= new IpValidator();
        boolean isValidIp= false;
        IpRange ipRange= new IpRange();

        Scanner ipInput = new Scanner(System.in);
        String ipStr;

        //isValidIpStr the validity of the entered string
        // if notvalidity return enter
        while(!isValidIp) {
            System.out.print("\nEnter 1-st ip: ");
            //enter 1-st ip
            ipStr = ipInput.nextLine();
            if (validator.isValidIpStr(ipStr)) {
                ipAddress1= IpMapper.get(ipStr);
                isValidIp= true;
            }
        }

        isValidIp= false;
        while(!isValidIp) {
            System.out.print("\nEnter 2-nd ip: ");
            //enter 2-nd ip
            ipStr = ipInput.nextLine();
            if (validator.isValidIpStr(ipStr)) {
                ipAddress2= IpMapper.get(ipStr);
                isValidIp= true;
            }
        }

        LimitsIpRange limitsIpRange= new LimitsIpRange();
        limitsIpRange.findLimitsIpRange(ipAddress1, ipAddress2);

        IpPrinter.print(ipRange.get( limitsIpRange.getLowLimitIpRange(), limitsIpRange.getTopLimitIpRange()) );


    }

}
