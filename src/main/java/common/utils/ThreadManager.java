package common.utils;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ThreadManager {
    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    private static ThreadLocal<SoftAssert> threadLocalSoftAssert = new ThreadLocal<>();
    private static ThreadLocal<String> threadLocalString = new ThreadLocal<>();


    public static void setDriver(WebDriver driver){
        threadLocalDriver.set(driver);
    }

    public static String getData() {
        return threadLocalString.get();
    }

    public static void setData(String data) {
        threadLocalString.set(data);
    }

    public static void setSoftAssert(SoftAssert softAssert){
        threadLocalSoftAssert.set(softAssert);
    }

    public static WebDriver getDriver(){
        return threadLocalDriver.get();
    }

    public static SoftAssert getSoftAssert(){
        return threadLocalSoftAssert.get();
    }


}
