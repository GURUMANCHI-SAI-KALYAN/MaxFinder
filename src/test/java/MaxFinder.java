import org.junit.Assert;
import org.junit.Test;

public class MaxFinder {
    @Test
    public void givenThreeIntereg_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        int max = maxFinder.findMax(300, 400, 500);
        Assert.assertEquals(500, max);
    }

    @Test
    public void givenThreeflot_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        Float max = maxFinder.findFloatMax(1.0f, 2.0f, 3.0f);
        Assert.assertEquals(3.0, max,0);
    }
    @Test
    public void givenThreeStringValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        String max =  maxFinder.findStringMax("grapes", "orange", "mango");
        Assert.assertEquals("orange", max);
    }
}
