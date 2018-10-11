public class IpMapper {
    public static IpAddress get(String ipString){
        IpAddress ipAddress = new IpAddress();

        String[] part = ipString.split("\\.");
        ipAddress.setPart1(Integer.valueOf(part[0]));
        ipAddress.setPart2(Integer.valueOf(part[1]));
        ipAddress.setPart3(Integer.valueOf(part[2]));
        ipAddress.setPart4(Integer.valueOf(part[3]));

        return ipAddress;
    }
}
