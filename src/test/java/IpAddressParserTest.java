import org.junit.*;

import java.util.ArrayList;


public class IpAddressParserTest {
    IpParser ipParser;
     ArrayList<Integer> IpAddress;

    @Before
    public void setUp() {
        ipParser = new IpParser();
        IpAddress = new ArrayList<Integer>();
    }

    @After
    public void setDown(){
        ipParser = null;
    }

    @Test
    public void testExecute() throws Exception{
        IpAddress.add(1);
        IpAddress.add(123);
        IpAddress.add(43);
        IpAddress.add(255);
        Assert.assertEquals(IpAddress, ipParser.get("1.123.43.255"));
    }



}
