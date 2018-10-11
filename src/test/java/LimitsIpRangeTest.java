import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LimitsIpRangeTest {
    private LimitsIpRange limitsIpRange;
    private IpAddress idIpAddress1 = new IpAddress(1,1,1,1);
    private IpAddress idIpAddress2 = new IpAddress(1,1,1,2);
    private IpAddress idIpAddress3 = new IpAddress(1,1,2,1);
    private IpAddress idIpAddress4 = new IpAddress(1,23,1,1);
    private IpAddress idIpAddress5 = new IpAddress(6,0,1,0);

    @Before
    public void setUp() {
        limitsIpRange = new LimitsIpRange();
    }

    @Test
    public void testFindLimitsIpRange(){
        limitsIpRange.findLimitsIpRange(idIpAddress1,idIpAddress2);
        Assert.assertEquals(limitsIpRange.getLowLimitIpRange(), idIpAddress1);
        Assert.assertEquals(limitsIpRange.getTopLimitIpRange(), idIpAddress2);

        limitsIpRange.findLimitsIpRange(idIpAddress1,idIpAddress3);
        Assert.assertEquals(limitsIpRange.getLowLimitIpRange(), idIpAddress1);
        Assert.assertEquals(limitsIpRange.getTopLimitIpRange(), idIpAddress3);

        limitsIpRange.findLimitsIpRange(idIpAddress1,idIpAddress4);
        Assert.assertEquals(limitsIpRange.getLowLimitIpRange(), idIpAddress1);
        Assert.assertEquals(limitsIpRange.getTopLimitIpRange(), idIpAddress4);

        limitsIpRange.findLimitsIpRange(idIpAddress1,idIpAddress5);
        Assert.assertEquals(limitsIpRange.getLowLimitIpRange(), idIpAddress1);
        Assert.assertEquals(limitsIpRange.getTopLimitIpRange(), idIpAddress5);

    }

}
