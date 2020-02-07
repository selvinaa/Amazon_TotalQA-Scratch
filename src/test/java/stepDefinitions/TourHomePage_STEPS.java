package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TourHomePage;
import stepDefinitionsImpl.HomePage_impl;
import stepDefinitionsImpl.TourHomePage_impl;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class TourHomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    HomePage_impl homePage_impl = new HomePage_impl();
    TourHomePage tourHomePage = new TourHomePage();
    TourHomePage_impl tourHomePageImpl = new TourHomePage_impl();
    // here just call contractor of class u want and the method name to user all u need


    @When("User clicks {string}")// CREATE ANOTHER PAGE TO TOUR
    public void user_clicks(String string) {
        SeleniumUtils.sleep(3000);
       tourHomePageImpl.clickTourHomePage();

    }

    @Then("User Verify {string}")
    public void user_Verify(String string) {
        Assert.assertEquals(driver.getTitle(), "Spectaculars Of The Nile 3 Nights");

    }

    @When("User sees pop up window {string}")
    public void user_sees_pop_up_window(String expected) {
        SeleniumUtils.sleep(2000);
       //Assert.assertTrue(tourHomePage.packages_BookingTitle.isDisplayed());
       Assert.assertEquals(expected, tourHomePage.packages_BookingTitle.getText());

    }

    @When("User fills out information")
    public void user_fills_out_information() {
        SeleniumUtils.sleep(2000);
        tourHomePageImpl.clickPackageBooking();
    }

    @When("User clicks Search Button")
    public void user_clicks_Search_Button() {
        //tourHomePageImpl.clickPackageBooking();

    }




}
