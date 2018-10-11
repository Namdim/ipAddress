import java.util.ArrayList;
import java.util.List;

public class IpPrinter {
    private static final String DOT = ".";

    public static void print(List<IpAddress> ipAddresses){
        for(int i = 0; i < ipAddresses.size(); i++){
            System.out.println(ipAddresses.get(i).getPart1()+DOT+ipAddresses.get(i).getPart2()+DOT+ipAddresses.get(i).getPart3()+DOT+ipAddresses.get(i).getPart4());
        }
    }
}
