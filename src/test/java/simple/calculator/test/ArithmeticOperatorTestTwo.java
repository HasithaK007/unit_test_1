package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTestTwo {
    ArithmeticOperator calc;
    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();
        
    }

    @Test
    public void testSum1() {
        Assert.assertEquals(calc.sum(0,1),1);
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(calc.sum(0,-1),-11);
    }

    @Test
    public void testSum3() {
        Assert.assertEquals(calc.sum(-2147,-1),-2148);
    }

    @Test
    public void testSum4() {
        Assert.assertEquals(calc.sum(2146,1),2147);
    }


}
