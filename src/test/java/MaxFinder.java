
import org.junit.Assert;
import org.junit.Test;


class MaxFinderTest {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder(300, 400, 500);
        int max = (int) maxFinder.maximum();
        Assert.assertEquals(500, max);
    }

    @Test
    public void givenThreeFloatValue_ShouldReturnMaxvalue() {
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

    @Test
    public void givenFiveIntegerinVarargs_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        int max = (int) maxFinder.max(30, 10, 50,500,400);
        Assert.assertEquals(500, max);
    }

    @Test
    public void givenFiveFloatinVarargs_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        float max = (float) maxFinder.max(58.5f, 787.5f, 445.25f,885.2f,487.36f);
        Assert.assertEquals(885.2f, max,0);
    }

    @Test
    public void givenSixStringinVarargs_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        String  max = (String) maxFinder.max("grapes","mango","Orange","kwie","jack","lemon");
        Assert.assertEquals("orange", max);
    }
}