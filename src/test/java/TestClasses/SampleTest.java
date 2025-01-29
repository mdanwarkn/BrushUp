package TestClasses;

import common.utils.ThreadManager;
import listners.AnnotationTransformer;
import listners.MyRetryAnalyzer;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.example.Child;
import org.example.Main;
import org.example.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.*;

import static org.testng.AssertJUnit.assertEquals;

@Listeners({AnnotationTransformer.class})
public class SampleTest {

    @BeforeMethod(groups = "smoke1")
    @Parameters("environment")
    public void setUp(String environment){
        System.out.println("Before method with group");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to(environment);

        ThreadManager.setDriver(driver);
        ThreadManager.setSoftAssert(new SoftAssert());


        Set<String> set = driver.getWindowHandles();



    }
//

//    @Test(groups="windowTest")
//    public void windowTest() throws InterruptedException {
//        System.out.println("Before method with group");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("https://www.orangecrm.com/");
//
//        Actions actions = new Actions(driver);
//
//        String features = "//a[text()='FEATURES']";
//        String BUY = "//a[text()='BUY']";
//        String API = "//a[text()='API']";
//        String SUPPORT = "//a[text()='SUPPORT']";
//
//        actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath(features))).build().perform();
//        Thread.sleep(5000);
//
//        actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath(BUY))).build().perform();
//        Thread.sleep(5000);
//
//        actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath(API))).build().perform();
//        Thread.sleep(5000);
//
//        actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath(SUPPORT))).build().perform();
//        Thread.sleep(5000);
//
//        List<String> list = new ArrayList<>(driver.getWindowHandles());
//        for(String Id : list){
//            System.out.println(driver.switchTo().window(Id).getTitle());
//            Thread.sleep(5000);
//        }
//
//       // System.out.println(driver.switchTo().defaultContent().getTitle());
//
//    }

    @BeforeMethod
    public void withoutGroup(){
        System.out.println("Before method without group");
    }

    @Test(priority=0 , dataProvider = "dp" ,  groups = {"smoke1"} )
    public void demo1(int o) {
        ThreadManager.setData(Thread.currentThread().getId()+" Method 1");
        System.out.println(ThreadManager.getData());
        assertEquals(0,1);
    }

    //, dependsOnGroups = {"smoke1"}
    @Test(priority=0 , dataProvider = "dp", groups= {"smoke2"} )
    public void demo2(int o) {
        ThreadManager.setData(Thread.currentThread().getId() +" Method 2");
        System.out.println(ThreadManager.getData());
        assertEquals(1,1);
    }


    @Test(groups="ExceptionTest")
    public void exceptionTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://selectorshub.com/xpath-practice-page/");

        Thread.sleep(5000);

        //WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5));
       // wait.ignoring(Exception.class);

        ExpectedCondition<WebElement> condition = ExpectedConditions.presenceOfElementLocated((By.xpath("//select[@name='car']")));
        System.out.println("Visibility : "+wait.until(condition));

        Function<WebDriver , WebElement> expectedCondition = driver1 -> null;

        WebElement e = driver.findElement(By.id(""));
        Actions action = new Actions(driver);


        Map<String,String> map = new HashMap<>();
        Set<Map.Entry<String,String>> set = map.entrySet();

        driver.close();
    }

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
    }

    @DataProvider
    public Object[][] dp(){
        return new Object[][]{{1}};
    }

    @AfterMethod()
    public void tearDown(){
        System.out.println("Tear Down end seperate");
        ThreadManager.getDriver().quit();
    }


//    @Test(priority=0 , dataProvider = "readDataFromExcel",dataProviderClass = StaticDataProvider.class)
//    public void demo1(int o) {
//
//    }
}



//List - LinkedList , ArrayList ,  Vector
//List<String> list = new ArrayList<>();
//        list.add("abcd");
//        list.add("abcd");
//        list.add("abcd");
//
//        list.set(1,"xyz");
//        System.out.println(list);
//
//
//
//List<String> res = list.stream().sorted().collect(Collectors.toList());
//
//
////               filter(str->{
////           return str.length()>3;
////       }).collect(Collectors.toList());
//       System.out.println(res);
////

//Below all are queue implemenation
//Queue<String> list = new LinkedList<>(); // For queue and list implementation
//PriorityQueue<String> list = new PriorityQueue<>(); //Min and Max heap
//ArrayDeque<String> list = new ArrayDeque<>();


// Stack implementation
//Stack<String> stack = new Stack<>();


//Extent report to overcome all this configuration we can use extent adaptor
//ExtentSparkReporter reporter = new ExtentSparkReporter("");
//ExtentReports extentReport = new ExtentReports();
//		extentReport.attachReporter(reporter);
//
//ExtentTest test = extentReport.createTest("test1");