import java.util.ArrayList;

public class IpPrinter {

    public static void print(ArrayList<IpAddress> ipAddresses){
        for(int i=0; i<ipAddresses.size(); i++){
            System.out.println(ipAddresses.get(i).getPart1()+"."+ipAddresses.get(i).getPart2()+"."+ipAddresses.get(i).getPart3()+"."+ipAddresses.get(i).getPart4());
        }
    }
}
