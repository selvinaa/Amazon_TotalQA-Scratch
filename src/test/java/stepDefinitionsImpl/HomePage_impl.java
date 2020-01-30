package stepDefinitionsImpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utils.Driver;
import utils.SeleniumUtils;

public class HomePage_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    // ALL METHODS GOST HERE


    public void getIntoTopic(){

        SeleniumUtils.click(homePage.javaOops_Btn);
        Actions action = new Actions(driver);


    }


}
