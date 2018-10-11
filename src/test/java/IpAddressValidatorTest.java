import org.junit.*;
import static org.junit.Assert.*;

public class IpAddressValidatorTest {
    IpValidator validator;
    @Before // Перед началом теста создадим обект validator
    public void setUp() {
        validator = new IpValidator();
    }
    @After
    public void serDown(){
        validator= null;
    }
    @Test
    public void testCheck(){

    }
}
