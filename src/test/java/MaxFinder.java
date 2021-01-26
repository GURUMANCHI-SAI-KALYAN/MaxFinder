import junit.framework.Assert;
import org.junit.Test;

public class MaxFinder {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder= new MaxFinder();
        int max = maxFinder.findMax(300, 400, 500);
        Assert.assertEquals(400,max);
    }
}
