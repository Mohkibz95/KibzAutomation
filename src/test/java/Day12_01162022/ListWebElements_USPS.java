package Day12_01162022;

import Day9_01082022.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class ListWebElements_USPS extends Reusable_Annotations {

    @Test
    public void uspsTest(){
        //navigate to usps
        driver.navigate().to("https://www.usps.com");

        //using explicit wait to get the count of elements within same class group
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            List<WebElement> uspsTabs = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            System.out.println("My Nav list count is " + uspsTabs.size());
            logger.log(LogStatus.PASS,"Successfully got the count " + uspsTabs.size());
            //Size means to count the list of web elements
        } catch (Exception e) {
            System.out.println("unable to locate links " + e);
            logger.log(LogStatus.FAIL,"Unable to locate Links " + e);
            Reusable_Actions_Loggers.getScreenShot(driver,"links count",logger);
        }//End of try

    }//end of test
}//End of class
