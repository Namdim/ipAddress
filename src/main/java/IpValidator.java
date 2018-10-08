import java.util.ArrayList;

public class IpValidator {

   private IpParser parser= new IpParser();
   private ArrayList<Integer> Iptmp= new ArrayList<Integer>();


    //Определяем находится ли элемент 0, 255
    private boolean validate(Integer element){
        if(element>=0 && element<=255)
            return true;
        else
            return  false;
    }

    //проверяет на количество элементов в предполанаемом ip
    //проверяет каждый элемент на допустимый диапозон
    public boolean check(String IpStr) {
        //парсим ввеженую строку и возвращаем полученный списиок элементов ip

        Iptmp = parser.execute(IpStr);

        //если в строке точек не валидное количество
        if(Iptmp.get(0)!=-1) {
            //если количество элементов не равно 4, то строка не валидна
            if (Iptmp.size() == 4) {
                for (int i = 0; i < Iptmp.size(); i++) {
                    if (validate(Iptmp.get(i)) == false) {
                        System.out.print("Элемент " + Iptmp.get(i) + "вне диапозона 0, 255");
                        return false;
                    }
                }
            } else {
                System.out.print("Не валидное количество элементов в ip" + Iptmp.size());
                return false;
            }
        }
        else return false;

        return true;
    }
    public ArrayList<Integer> setValidIp(){
        return Iptmp;
    }
}
