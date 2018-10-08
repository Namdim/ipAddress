import java.util.ArrayList;

public class IpValidator {

    //validate element limit 0, 255
    public boolean validate(Integer element){
        if(element>=0 && element<=255)
            return true;
        else
            return  false;
    }
    public boolean check(ArrayList<Integer> Ip) {
        
    }
}
