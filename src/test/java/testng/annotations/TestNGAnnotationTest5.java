package testng.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationTest5 {

    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test
    public void testCreate() {
        System.out.println("Create");
    }


    @Test
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void testLogOut() {
        System.out.println("LogOut");
    }


}
