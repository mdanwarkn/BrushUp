package TestClasses;

import common.utils.ThreadManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class TestNGTest {

    @BeforeMethod
    @Parameters("environment")
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @Test()
    public void internalTest() throws InterruptedException, IOException {
        System.out.println("Maven Command test");
            URL url = new URL("http://localhost:4444");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--start-maximized");
            WebDriver driver = new RemoteWebDriver(url , option);
            driver.navigate().to("https://cucumber.io/");
    }

}


//Learnings
//        try(FileInputStream fileInputStream = new FileInputStream(new File());Properties properties = new Properties(fileInputStream)){
//            properties.load(new FileInputStream(new File("")));
//
//            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//            Sheet sheet = workbook.getSheet("Sheet");
//            Row row = sheet.getRow(0);
//            Cell cell = row.getCell(0 , Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
//


//            String s = "dummy";
////            switch(s) {
////                case "dummy" -> {
////
////                    int a = 1 + 2;
////                    int b = 3 + 1;
////                }
////            }
//
//            List<String> list = List.of("abc","ab");
//            List<String> res = list.stream().filter(element -> element.length()>=3).collect(Collectors.toList());
//            System.out.println(list);
//            System.out.println(res);
//
