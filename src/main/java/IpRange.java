public class IpRange {
    // id range: range1.range2.range3.range4
    private Boolean range4= false, range3= false, range2= false, range1= false;
    private int upLimitRange = 256;

    public boolean print(IpAddress ipAddress1, IpAddress ipAddress2){
        compare(ipAddress1, ipAddress2);
        int range4tmp= ipAddress1.getPart4(), range3tmp= ipAddress1.getPart3(), range2tmp= ipAddress1.getPart2();
        //System.out.println("Start :"+ipAddress1.getPart1()+"."+ipAddress1.getPart2()+"."+ipAddress1.getPart3()+"."+ipAddress1.getPart4()+"----");

        if(range1){
            //переходим к range2
            if(range2){
                //переходим к range3
                if (range3){
                    //переходим к range 4
                    if (range4){
                        System.out.println("ip одиаковы");
                    }
                    else {
                        //выводим range 4
                        for (int l = 0; l<= ipAddress2.getPart4(); l++){
                            System.out.println(ipAddress2.getPart1()+"."+ ipAddress2.getPart2()+"."+ ipAddress2.getPart3()+"."+l);
                        }
                        return true;
                    }
                }
                else {
                    //выводим range 3
                    for(int i = ipAddress1.getPart3(); i<= ipAddress2.getPart3(); i++){
                        if(i== ipAddress2.getPart3()) break;
                        for(int j = range4tmp; j< upLimitRange; j++){
                            System.out.println(ipAddress1.getPart1()+"."+ ipAddress1.getPart2()+"."+i+"."+j);
                        }
                        range4tmp=0;
                    }
                    //выводим range 4
                    for (int l = 0; l<= ipAddress2.getPart4(); l++){
                        System.out.println(ipAddress2.getPart1()+"."+ ipAddress2.getPart2()+"."+ ipAddress2.getPart3()+"."+l);
                    }
                    return true;
                }
            }
            // выводим range 2
            else{


                for(int k = ipAddress1.getPart1(); k<= ipAddress2.getPart2(); k++) {
                    if (k == ipAddress2.getPart2()) break;
                    for (int i = range3tmp; i < upLimitRange; i++) {
                        for (int j = range4tmp; j < upLimitRange; j++) {
                            System.out.println(ipAddress1.getPart1() + "." + k + "." + i + "." + j);
                        }
                        range4tmp = 0;
                    }
                    range3tmp=0;
                }
                //выводим range 4
                for (int l = 0; l<= ipAddress2.getPart4(); l++){
                    System.out.println(ipAddress2.getPart1()+"."+ ipAddress2.getPart2()+"."+ ipAddress2.getPart3()+"."+l);
                }
                return true;
            }
        }
        // выводим range 1
        else{
            for(int l = ipAddress1.getPart1(); l<= ipAddress2.getPart1(); l++ ) {
                if(l== ipAddress2.getPart1()) break;
                for (int k = range2tmp; k < upLimitRange; k++) {
                    for (int i = range3tmp; i < upLimitRange; i++) {
                        for (int j = range4tmp; j < upLimitRange; j++) {
                            System.out.println(l + "." + k + "." + i + "." + j);
                        }
                        range4tmp = 0;
                    }
                    range3tmp = 0;
                }
                range2tmp=0;
            }
            for (int l = 0; l<= ipAddress2.getPart4(); l++){
                System.out.println(ipAddress2.getPart1()+"."+ ipAddress2.getPart2()+"."+ ipAddress2.getPart3()+"."+l);
            }
        }
        return true;
    }
    public void compare(IpAddress ipAddress1, IpAddress ipAddress2){

        if(ipAddress1.getPart1()== ipAddress2.getPart1()) range1= true;
        if (ipAddress1.getPart2()== ipAddress2.getPart2()) range2=true;
        if (ipAddress1.getPart3()== ipAddress2.getPart3()) range3=true;
        if (ipAddress1.getPart4()== ipAddress2.getPart4()) range4= true;
    }
}