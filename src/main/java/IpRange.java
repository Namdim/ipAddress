public class IpRange {
    private Boolean range4= false, range3= false, range2= false, range1= false;

    public boolean print(Ip ip1, Ip ip2){
        compare(ip1,ip2);
        int range4tmp=ip1.getElement4(), range3tmp= ip1.getElement3(), range2tmp= ip1.getElement2();
        //System.out.println("Start :"+ip1.getElement1()+"."+ip1.getElement2()+"."+ip1.getElement3()+"."+ip1.getElement4()+"----");

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
                        for (int l=0; l<=ip2.getElement4();l++){
                            System.out.println(ip2.getElement1()+"."+ip2.getElement2()+"."+ip2.getElement3()+"."+l);
                        }
                        return true;
                    }
                }
                else {
                    //выводим range 3
                    for(int i= ip1.getElement3(); i<=ip2.getElement3(); i++){
                        if(i==ip2.getElement3()) break;
                        for(int j=range4tmp; j<256; j++){
                            System.out.println(ip1.getElement1()+"."+ip1.getElement2()+"."+i+"."+j);
                        }
                        range4tmp=0;
                    }
                    //выводим range 4
                    System.out.println("-------");
                    for (int l=0; l<=ip2.getElement4();l++){
                        System.out.println(ip2.getElement1()+"."+ip2.getElement2()+"."+ip2.getElement3()+"."+l);
                    }
                    return true;
                }
            }
            // выводим range 2
            else{


                for(int k=ip1.getElement1(); k<=ip2.getElement2(); k++) {
                    if (k == ip2.getElement2()) break;
                    for (int i = range3tmp; i <= 256; i++) {
                        for (int j = range4tmp; j < 256; j++) {
                            System.out.println(ip1.getElement1() + "." + k + "." + i + "." + j);
                        }
                        range4tmp = 0;
                    }
                    range3tmp=0;
                }
                //выводим range 4
                System.out.println("-------");
                for (int l=0; l<=ip2.getElement4();l++){
                    System.out.println(ip2.getElement1()+"."+ip2.getElement2()+"."+ip2.getElement3()+"."+l);
                }
                return true;
            }
        }
        // выводим range 1
        else{
            for(int l=ip1.getElement1();l<=ip2.getElement1();l++ ) {
                if(l==ip2.getElement1()) break;
                for (int k = range2tmp; k <= 256; k++) {
                    for (int i = range3tmp; i <= 256; i++) {
                        for (int j = range4tmp; j < 256; j++) {
                            System.out.println(l + "." + k + "." + i + "." + j);
                        }
                        range4tmp = 0;
                    }
                    range3tmp = 0;
                }
                range2tmp=0;
            }
            System.out.println("-------");
            for (int l=0; l<=ip2.getElement4();l++){
                System.out.println(ip2.getElement1()+"."+ip2.getElement2()+"."+ip2.getElement3()+"."+l);
            }
        }
        return true;
        /*System.out.println("End print:");
        for (int l=0; l<=ip2.getElement4();l++){
            System.out.println(ip2.getElement1()+"."+ip2.getElement2()+"."+ip2.getElement3()+"."+l);
        }*/
    }
    public void compare(Ip ip1, Ip ip2){

        if(ip1.getElement1()==ip2.getElement1()) range1= true;
        if (ip1.getElement2()==ip2.getElement2()) range2=true;
        if (ip1.getElement3()==ip2.getElement3()) range3=true;
        if (ip1.getElement4()==ip2.getElement4()) range4= true;
    }
}