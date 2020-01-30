package stepDefinitionsImpl;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class Hooks {
    public static Scenario currentScenario;

    @Before
    public void beforeScenario(Scenario scenario){
        Driver.getDriver();
        currentScenario = scenario;
    }

    @After
    public void afterScenario(){
        Driver.quitDriver();
    }

}
