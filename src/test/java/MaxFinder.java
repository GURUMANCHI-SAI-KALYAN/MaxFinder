import org.junit.Assert;
import org.junit.Test;

public class MaxFinder {


    @Test
    public void givenThreeIntereg_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder(300, 400, 500);
        int max = (int) maxFinder.maximum();
        Assert.assertEquals(500, max);
    }

    @Test
    public void givenThreeflot_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder(1.0f, 2.0f, 3.0f);
        Float max= (Float) maxFinder.maximum();
        Assert.assertEquals(3.0, max, 0);
    }
    @Test
    public void givenThreeStringValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder("grapes", "mango", "orange");
        String max = (String) maxFinder.maximum();
        Assert.assertEquals("orange", max);
    }
}
