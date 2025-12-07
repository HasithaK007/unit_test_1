package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest3 {
    @Test(groups = {"reg"})
    public void testGT3_1() {
        System.out.println("GPT3-1");
    }

    @Test
    public void testGT3_2() {
        System.out.println("GPT3-2");
    }

    @Test(groups = {"reg"})
    public void testGT3_3() {
        System.out.println("GPT3-3");
    }
}
