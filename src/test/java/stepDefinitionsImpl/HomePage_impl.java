package stepDefinitionsImpl;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.Iterator;
import java.util.Set;

public class HomePage_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    // ALL METHODS GOST HERE


    public void clickHomePage(){
       SeleniumUtils.click(homePage.first_Feature_Tour);


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
            }
        }
        // This is to switch to the main window
       // driver.switchTo().window(mainWindow);
//        WebElement windowSwitch = driver.findElement(By.className("google_ads_frame19"));
//        while(homePage.popUp_Iframe.isDisplayed()){
//            SeleniumUtils.click(homePage.popUp_Iframe);
//        }
//          driver.switchTo().parentFrame();



    //}



