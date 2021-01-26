import junit.framework.Assert;
import org.junit.Test;

public class MaxFinder {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder= new MaxFinder();
        int max = maxFinder.findMax(300, 200, 400);
        Assert.assertEquals(400,max);
    }
}
