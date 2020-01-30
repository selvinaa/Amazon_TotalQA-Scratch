package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    @Given("User open Home Page")
    public void user_open_Home_Page() {
        driver.get(ConfigReader.readProperty("url"));
        Assert.assertEquals(driver.getTitle(), "Total-QA - Future of Software Testing");
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("User clicks {string}")
    public void user_clicks(String string) {
        SeleniumUtils.waitForVisibilityOfElement(homePage.javaOops_Btn);
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("User click {string}")
    public void user_click(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("User sees pop up")
    public void user_sees_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("User verify the {string}")
    public void user_verify_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }





}
