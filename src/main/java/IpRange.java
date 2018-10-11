import java.util.ArrayList;
import java.util.List;

public class IpRange {

    private  static final int UP_LIMIT_RANGE = 256;
    // id range: range1.range2.range3.range4
    private boolean range4 = false, range3 = false, range2 = false, range1 = false;
    private List<IpAddress> ipAddresses = new ArrayList<IpAddress>();

    public List<IpAddress> get(IpAddress startIpAddress, IpAddress endIpAddress){
        set(startIpAddress, endIpAddress);
        return ipAddresses;
    }

    private boolean set(IpAddress startIpAddress, IpAddress endIpAddress){
        rewiewIpLimits(startIpAddress, endIpAddress);
        int range4tmp = startIpAddress.getPart4(), range3tmp = startIpAddress.getPart3(), range2tmp = startIpAddress.getPart2();

        if(range1){
            // go to range2
            if(range2){
                //go to range3
                if (range3){
                    //go to range 4
                    if (range4){
                        System.out.println("ip equals");
                    }
                    else {
                        //add range 4
                        for (int l = 0; l <= endIpAddress.getPart4(); l++){
                            addIpAddresses(endIpAddress.getPart1(), endIpAddress.getPart2(), endIpAddress.getPart3(), l );
                        }
                        return true;
                    }
                }
                else {
                    //add range 3
                    for(int i = startIpAddress.getPart3(); i <= endIpAddress.getPart3(); i++){
                        if(i == endIpAddress.getPart3()) break;
                        for(int j = range4tmp; j < UP_LIMIT_RANGE; j++){
                            addIpAddresses(startIpAddress.getPart1(), startIpAddress.getPart2(), i, j );
                        }
                        range4tmp=0;
                    }
                    //add range 4
                    for (int l = 0; l<= endIpAddress.getPart4(); l++){
                        addIpAddresses(endIpAddress.getPart1(), endIpAddress.getPart2(), endIpAddress.getPart3(), l);
                    }
                    return true;
                }
            }
            // add range 2
            else{


                for(int k = startIpAddress.getPart1(); k<= endIpAddress.getPart2(); k++) {
                    if (k == endIpAddress.getPart2()) break;
                    for (int i = range3tmp; i < UP_LIMIT_RANGE; i++) {
                        for (int j = range4tmp; j < UP_LIMIT_RANGE; j++) {
                            addIpAddresses(startIpAddress.getPart1(), k, i, j );
                        }
                        range4tmp = 0;
                    }
                    range3tmp=0;
                }
                //add range 4
                for (int l = 0; l<= endIpAddress.getPart4(); l++){
                    addIpAddresses(endIpAddress.getPart1(), endIpAddress.getPart2(), endIpAddress.getPart3(), l);
                }
                return true;
            }
        }
        // add range 1
        else{
            for(int l = startIpAddress.getPart1(); l<= endIpAddress.getPart1(); l++ ) {
                if(l== endIpAddress.getPart1()) break;
                for (int k = range2tmp; k < UP_LIMIT_RANGE; k++) {
                    for (int i = range3tmp; i < UP_LIMIT_RANGE; i++) {
                        for (int j = range4tmp; j < UP_LIMIT_RANGE; j++) {
                            addIpAddresses(l, k, i, j );
                        }
                        range4tmp = 0;
                    }
                    range3tmp = 0;
                }
                range2tmp=0;
            }
            for (int l = 0; l<= endIpAddress.getPart4(); l++){
                addIpAddresses(endIpAddress.getPart1(), endIpAddress.getPart2(), endIpAddress.getPart3(), l );
            }
        }
        return true;
    }

    private void addIpAddresses(int part1, int part2, int part3, int part4){
        ipAddresses.add(new IpAddress(part1,part2,part3,part4));
    }

    public void rewiewIpLimits(IpAddress startIpAddress, IpAddress endIpAddress){

        if(startIpAddress.getPart1()== endIpAddress.getPart1()) range1= true;
        if (startIpAddress.getPart2()== endIpAddress.getPart2()) range2=true;
        if (startIpAddress.getPart3()== endIpAddress.getPart3()) range3=true;
        if (startIpAddress.getPart4()== endIpAddress.getPart4()) range4= true;
    }
}