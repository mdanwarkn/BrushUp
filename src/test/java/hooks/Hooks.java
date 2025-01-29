package hooks;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@Smoke")
    public void beforeScenario(){
        System.out.println("Before scenario hooks");
    }
}
