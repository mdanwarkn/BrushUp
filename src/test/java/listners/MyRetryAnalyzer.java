package listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
    //If retry set to 0 it won't re run failed test
    final static int COUNTER = 1;
    int retried = 0;

    @Override
    public boolean retry(ITestResult result) {
        if(retried==COUNTER){
            return false;
        }
        retried++;
        return true;
    }
}
