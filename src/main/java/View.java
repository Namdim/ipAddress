import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        IpParser parser= new IpParser();
        ArrayList<Integer> Iptmp= new ArrayList<Integer>();
        IpValidator validator= new IpValidator();

        while(true) {
            //вводим 1-й ip
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 1-st ip: ");
            String ipStr = in.nextLine();



            //парсим его
            Iptmp = parser.execute(ipStr);

            if (Iptmp.get(0) == -1) {
                System.out.print("Повторите ввод ip \n");
            }
            else{
                //Валидный или нет
               validator.validate()

            }
        }


    }

}
