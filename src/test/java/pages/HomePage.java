package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {
    private static WebDriver driver = Driver.getDriver();

    public HomePage(){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "(//a[text()='Java Basics'])[2]")
    public WebElement javaOops_Btn;


}
