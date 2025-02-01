package common.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Utils {

    public static String getLocator(String path , String value){
        return String.format(path , value);
    }

    public static void takeScreenshot() throws IOException {
        Random random = new Random();
        int v = random.nextInt(10);

        WebDriver driver = ThreadManager.getDriver();
        if(driver==null){
            return;
        }
        TakesScreenshot takeScreenshot = (TakesScreenshot) (driver);
        File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+ File.separator + "Screenshot"+File.separator+v+"7.png";
        File dest = new File(path);
        FileUtils.copyFile(file , dest);
    }
}
