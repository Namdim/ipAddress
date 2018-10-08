import java.util.ArrayList;

public class IpValidator {

    IpParser parser= new IpParser();
    ArrayList<Integer> Iptmp= new ArrayList<Integer>();


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

        //если первый элемент -1, то строка не валидна
            if(Iptmp.size()==4) {
                for (int i = 0; i < Iptmp.size(); i++) {
                    if (validate(Iptmp.get(i)) == false) {
                        System.out.print("Элемент " + Iptmp.get(i) + "вне диапозона 0, 255");
                        return false;
                    }
                }
            }
            else {
                System.out.print("Не валидное количество элементов в ip");
                return false;
            }
        return true;
    }
}
