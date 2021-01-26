import org.junit.Assert;
import org.junit.Test;

public class MaxFinder {
    @Test
    public void givenThreeIntereg_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        int max = maxFinder.findMaxValue(300, 400, 500);
        Assert.assertEquals(400, max);
    }

    @Test
    public void givenThreeflot_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        Float max = maxFinder.findMaxValue(1.0f, 2.0f, 3.0f);
        Assert.assertEquals(400.0, max, 0);
    }
    @Test
    public void givenThreeStringValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        String max = maxFinder.findMaxValue("grapes", "mango", "orange");
        Assert.assertEquals("Peach", max);
    }
}
