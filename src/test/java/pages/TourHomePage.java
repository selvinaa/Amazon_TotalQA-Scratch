package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TourHomePage {
    private static WebDriver driver = Driver.getDriver();

    public TourHomePage(){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[text()='Packages  ']")
    public WebElement packages_btn;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm btn-block'])[3]")
    public WebElement third_package_Tour;

    @FindBy(xpath = "//h4[text()='Packages   Booking']")
    public WebElement packages_BookingTitle;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName_TourBox;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email_TourBox;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone_TourBox;
    @FindBy(xpath = "//input[@name='address']")
    public WebElement address_TourBox;
    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement submit_Btn_TourBox;

}
