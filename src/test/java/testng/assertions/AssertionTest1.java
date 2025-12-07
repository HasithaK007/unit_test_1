package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest1 {
    @Test
    public void testAssertEquals() {
        String actualValue = "Sri Lanka";
        Assert.assertEquals(actualValue, "Sri Lanka", "String Mismatched");

    }

    @Test
    public void testAssertEquals2() {
        String actualValue = "Sri Lanka";
        System.out.println("Prior to assertion");
        Assert.assertEquals(actualValue, "Sri Lanka", "String Mismatched");
        System.out.println("After Assertio");
    }

    @Test
    public void testAssertNotEquals() {
        String actualValue = "Sri Lanka";
        System.out.println("Prior to assertion");
        Assert.assertNotEquals(actualValue, "Sri lanka", "String Mismatched");
        System.out.println("After Assertion");
    }

    @Test
    public void testAssertTrue() {
        boolean actualVal=true;
        Assert.assertTrue(actualVal,"String Mismatched");
    }
}
