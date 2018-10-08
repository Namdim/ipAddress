import java.util.ArrayList;
//ArrayList<Integer>
public class IpParser {

    ArrayList<Integer> IpElements= new ArrayList<Integer>();

    public ArrayList<Integer> execute(String ipStr){

        String [] element = ipStr.split("\\.");

        System.out.print(" in parser execute" + ipStr+"\n");

        for (int i=0; i<element.length; i++){
            try{
                IpElements.add(Integer.parseInt(element[i]));
            }
            catch(NumberFormatException e ){ //в скобках указывается класс конкретной ожидаемой ошибки
                System.out.print("Ip element "+i+" ="+ element[i]+" novalide \n");
                IpElements.clear();
                IpElements.add(-1);
                break;
            }
        }

        return IpElements;
    }
}
