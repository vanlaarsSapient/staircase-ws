package staircase;

import org.junit.Assert;
import org.junit.Test;
import staircase.logic.Fibonacci;

public class FibonacciCalculationTest {


   private Fibonacci fibonacciCalculator = new Fibonacci();


    // test for first two conditions

    @Test
    public void should_return_1_when_height_0(){
        final Integer actualValue = fibonacciCalculator.numWays(0);
        final Integer expected = 1;
        Assert.assertEquals(expected, actualValue);
    }

    @Test
    public void should_return_1_when_height_1(){
        final Integer actualValue = fibonacciCalculator.numWays(1);
        final Integer expected = 1;
        Assert.assertEquals(expected, actualValue);
    }


    // Somewhere in INTEGER range > 0 and close to 0 due to performance issue

    @Test
    public void should_return_8_when_height_5(){
        final Integer actualValue = fibonacciCalculator.numWays(5);
        final Integer expected = 8;
        Assert.assertEquals(expected, actualValue);
    }


}
