import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {


        IpValidator validator= new IpValidator();


            //вводим 1-й ip
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 1-st ip: ");
            String ipStr = in.nextLine();

            System.out.print("\n");

            if ( validator.check(ipStr) )
                System.out.print("валидный ip");



    }

}
