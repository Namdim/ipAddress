import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
//ArrayList<Integer>
public class IpParser {

    ArrayList<Integer> IpElements= new ArrayList<Integer>();

    public ArrayList<Integer> execute(String ipStr){
        //убираем мусор
        IpElements.clear();

        String [] element = ipStr.split("\\.");

        //Считаем количество точек
        int countDot = ipStr.split("\\.",-1).length-1;
       // System.out.println("количество точек = " + countDot);

        if(countDot==3) {
            for (int i = 0; i < element.length; i++) {
                try {
                    IpElements.add(Integer.parseInt(element[i]));
                } catch (NumberFormatException e) { //в скобках указывается класс конкретной ожидаемой ошибки
                    System.out.print("Ip элемент " + i + " = " + element[i] + " не валидный \n");
                    IpElements.clear();
                    IpElements.add(-1);
                    break;
                }
            }
        }
        else{
            System.out.print("Количество точекне равно 3 \n");
            IpElements.clear();
            IpElements.add(-1);
        }
        return IpElements;
    }
}
