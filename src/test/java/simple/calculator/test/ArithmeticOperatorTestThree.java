package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTestThree {

    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test(dataProvider ="getData" )
    public void testSum1(int x,int y,int expected) {
        Assert.assertEquals(calc.sum(x,y),expected);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {0,1,1},
                {0,-1,-1},
                {-2147,-1,-2148},
                {2146,1,2147}
        };
    }

}
