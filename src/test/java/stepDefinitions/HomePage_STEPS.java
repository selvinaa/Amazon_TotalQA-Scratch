package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import stepDefinitionsImpl.HomePage_impl;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    HomePage_impl homePage_impl = new HomePage_impl();

    @Given("User open Home Page")
    public void user_open_Home_Page() {
        driver.get(ConfigReader.readProperty("url"));

    }
    @When("User sees {string}")
    public void user_sees(String string) {
       homePage_impl.clickHomePage();

    }


}
