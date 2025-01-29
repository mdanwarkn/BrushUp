package TestClasses;

import common.utils.ThreadManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest {


    @BeforeMethod
    @Parameters("environment")
    public void beforeMethod(@Optional String environment){
        System.out.println("Before method");
    }


    @Test(groups="windowTest")
    public void windowTest() throws InterruptedException {
        System.out.println("test Method 1");
        System.out.println("test Method 2");
        Assert.assertTrue(false);

    }

    @Test(dependsOnGroups = "windowTest" , alwaysRun = true)
    public void internalTest() throws InterruptedException {
        System.out.println("test Method 2");
    }

}
