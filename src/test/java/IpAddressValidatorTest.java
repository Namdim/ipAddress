import org.junit.*;
import static org.junit.Assert.*;

public class IpAddressValidatorTest {
    private IpValidator ipValidator;

    @Before
    public void setUp() {
        ipValidator = new IpValidator();
    }

    @Test
    public void testIsValidIpStr() throws Exception{
        String[] ipStr={"1.1.1.1", "1.256.168.2", "0.0.0.1.", "1,2.3.4","23.12o.1.2","1.2.3.4.5"};

        Assert.assertTrue( ipValidator.isValidIpStr(ipStr[0]) );
        Assert.assertFalse( ipValidator.isValidIpStr(ipStr[1]) );
        Assert.assertFalse( ipValidator.isValidIpStr(ipStr[2]) );
        Assert.assertFalse( ipValidator.isValidIpStr(ipStr[3]) );
        Assert.assertFalse( ipValidator.isValidIpStr(ipStr[4]) );
        Assert.assertFalse( ipValidator.isValidIpStr(ipStr[5]) );
    }
}
