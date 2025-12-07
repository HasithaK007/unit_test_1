package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {
    ArithmeticOperator calc;
    @BeforeMethod
    public void setUp() {

        calc = new ArithmeticOperator();
    }

    @Test
    public void testSum() {
        int actualVal= calc.sum(12,18);
        Assert.assertEquals(actualVal,29,"Result Mismatched");
    }
}
