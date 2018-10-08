import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        Ip ip1 = new Ip();
        Ip ip2 = new Ip();
        IpValidator validator= new IpValidator();
        Boolean validIp= false;

        //вводим 1-й ip
        Scanner ipInput = new Scanner(System.in);
        String ipStr;


        //проверяем на валидность введенную строку
        // если валидна, то возвращаем данные в нужном виде
        while(validIp==false) {
            System.out.print("\nEnter 1-st ip: ");
            ipStr = ipInput.nextLine();
            if (validator.check(ipStr)) {
                ip1.setElement1(validator.setValidIp().get(0));
                ip1.setElement2(validator.setValidIp().get(1));
                ip1.setElement3(validator.setValidIp().get(2));
                ip1.setElement4(validator.setValidIp().get(3));
                validIp= true;
                //   System.out.print(ip1.getElement1()+"."+ip1.getElement2()+"."+ip1.getElement3()+"."+ip1.getElement4() );
            }

        }
        validIp= false;
        while(validIp==false) {
            System.out.print("\nEnter 2-nd ip: ");
            ipStr = ipInput.nextLine();

            if (validator.check(ipStr)) {
                ip1.setElement1(validator.setValidIp().get(0));
                ip1.setElement2(validator.setValidIp().get(1));
                ip1.setElement3(validator.setValidIp().get(2));
                ip1.setElement4(validator.setValidIp().get(3));
                validIp= true;
                //System.out.print(ip1.getElement1()+"."+ip1.getElement2()+"."+ip1.getElement3()+"."+ip1.getElement4() );
            }
        }


    }

}
