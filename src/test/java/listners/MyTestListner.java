package listners;

import common.utils.ThreadManager;
import common.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.IOException;

public class MyTestListner implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            Utils.takeScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
       System.out.println("TestNG test starts - Listners");
    }

}
