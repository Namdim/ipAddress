import java.util.ArrayList;

public class LimitsIpRange {
    private IpAddress topAddress, lowAddress;
    public IpAddress getTopLimitIpRange(){
        return topAddress;
    }
    public IpAddress getLowLimitIpRange(){
        return lowAddress;
    }
    public void findLimitsIpRange(IpAddress ipAddress1, IpAddress ipAddress2){

        if (ipAddress1.getPart1()>ipAddress2.getPart1()){
            topAddress=ipAddress1;
            lowAddress= ipAddress2;
        }
        if (ipAddress1.getPart1()<ipAddress2.getPart1()){
            topAddress=ipAddress2;
            lowAddress= ipAddress1;
        }

        if (ipAddress1.getPart1()==ipAddress2.getPart1()){
            if(ipAddress1.getPart2()>ipAddress2.getPart2()){
                topAddress=ipAddress1;
                lowAddress= ipAddress2;
            }
            if (ipAddress1.getPart2()<ipAddress2.getPart2()){
                topAddress=ipAddress2;
                lowAddress= ipAddress1;
            }
        }
        if (ipAddress1.getPart1()==ipAddress2.getPart1()){
            if(ipAddress1.getPart2()==ipAddress2.getPart2()){
                if(ipAddress1.getPart3()>ipAddress2.getPart3()){
                    topAddress=ipAddress1;
                    lowAddress= ipAddress2;
                } else{
                    topAddress=ipAddress2;
                    lowAddress= ipAddress1;
                }
            }
        }


        if (ipAddress1.getPart1()==ipAddress2.getPart1()){
          if(ipAddress1.getPart2()==ipAddress2.getPart2()){
              if(ipAddress1.getPart3()==ipAddress2.getPart3()){

                  if(ipAddress1.getPart4()==ipAddress2.getPart4()){
                      System.out.println("Limits equals");
                  }else{
                      if(ipAddress1.getPart4()>ipAddress2.getPart4()){
                            topAddress=ipAddress1;
                            lowAddress=ipAddress2;
                      }
                      else{
                          topAddress=ipAddress2;
                          lowAddress=ipAddress1;
                      }
                  }

              }
          }
        }

    }
}
