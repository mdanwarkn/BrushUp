package SetUp;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class StaticDataProvider {

    @DataProvider(parallel = true)
    public static Object[][] readDataFromExcel(Method method){



        System.out.println("Class : "+method.getDeclaringClass().getName());
        System.out.println("Method : "+method.getName());
        return new Object[][]{{1},{2}};
    }



}
