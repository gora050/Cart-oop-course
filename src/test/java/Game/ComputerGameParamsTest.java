package Game;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ComputerGameParamsTest {
    private ComputerGameParams someParams, otherParams;

    @Before
    public void setUp() throws Exception {
        someParams = ComputerGameTestObjects.GameParams1();
        otherParams = ComputerGameTestObjects.GameParams2();
    }

    @Test
    public void filterTest1() throws Exception {
        assertTrue(someParams.filter(someParams));
    }

    @Test
    public void TestDescription() throws Exception {
        assertFalse(someParams.getDescription() == otherParams.getDescription());
    }

    @Test
    public void filterTest2() throws Exception {
        assertFalse(someParams.filter(otherParams));
    }
}
