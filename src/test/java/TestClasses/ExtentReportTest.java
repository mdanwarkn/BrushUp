package TestClasses;

import listners.MyTestListner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListner.class)
public class ExtentReportTest {

    @Test(dataProvider = "dp")
    public void checkHTMLReport(int value){
        System.out.println("HTML report Tested");
        System.out.println("---------------------End-------------------------");
    }

    @DataProvider
    public Object[][] dp(){
        return new Object[][]{{1},{2},{3},{4},{5},{6}};
    }
}
