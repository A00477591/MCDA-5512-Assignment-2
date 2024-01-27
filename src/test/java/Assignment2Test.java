import com.smu.mscda.CapitalizeMd5;
import org.junit.Assert;
import org.junit.Test;

public class Assignment2Test {
    private final String inputString="smu";

    @Test
    public void testCapitalize() {
        Assert.assertEquals("Smu", CapitalizeMd5.initCapString(inputString));
    }

    @Test
    public void testMd5() {
        Assert.assertEquals("3773300c2f413cc7136f8d74b305519c", CapitalizeMd5.md5String(inputString));
    }
}
