package stepDefinitionsImpl;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TourHomePage;
import testData.NewUserInfo;
import utils.Driver;
import utils.SeleniumUtils;

public class TourHomePage_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    TourHomePage tourHomePage = new TourHomePage();
    NewUserInfo newUserInfo = new NewUserInfo();
    // ALL METHODS GOes HERE


    public void clickTourHomePage() {
        SeleniumUtils.click(tourHomePage.packages_btn);
        SeleniumUtils.click(tourHomePage.third_package_Tour);
    }

    public void clickPackageBooking() {
        SeleniumUtils.sleep(500);
        SeleniumUtils.sendKeys(tourHomePage.firstName_TourBox, newUserInfo.getFirstName());
        SeleniumUtils.sendKeys(tourHomePage.email_TourBox, newUserInfo.getEmail());
        SeleniumUtils.sendKeys(tourHomePage.phone_TourBox, newUserInfo.getCellPhoneNum());
        SeleniumUtils.sendKeys(tourHomePage.address_TourBox, newUserInfo.getAddress());
        SeleniumUtils.sleep(800);
        SeleniumUtils.click(tourHomePage.submit_Btn_TourBox);


    }

}


    //        String mainWindow=driver.getWindowHandle();
//        // It returns no. of windows opened by WebDriver and will return Set of Strings
//        Set<String> set =driver.getWindowHandles();
//        // Using Iterator to iterate with in windows
//        Iterator<String> eachWindow= set.iterator();
//        while(eachWindow.hasNext()){
//            String childWindow=eachWindow.next();
//            // Compare whether the main windows is not equal to child window. If not equal, we will close.
//            if(!mainWindow.equals(childWindow)){
//                driver.switchTo().window(childWindow);
//             //   System.out.println(driver.switchTo().window(childWindow).getTitle());
//                //SeleniumUtils.sleep(2000);
//                driver.close();
//}
        // This is to switch to the main window
       // driver.switchTo().window(mainWindow);
//        WebElement windowSwitch = driver.findElement(By.className("google_ads_frame19"));
//        while(homePage.popUp_Iframe.isDisplayed()){
//            SeleniumUtils.click(homePage.popUp_Iframe);
//        }
//          driver.switchTo().parentFrame();

    //}



