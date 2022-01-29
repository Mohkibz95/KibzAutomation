package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Reusable_Library.Reusable_Actions_Loggers_POM.getScreenShot;

public class BagPage extends Reusable_Annotations {
    ExtentTest logger;
    public BagPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method



    @FindBy(xpath = "//*[text()='+Size+']")
    WebElement Size;
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddToBag;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;



    public void Size(String Size) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Size");
        logger.log(LogStatus.INFO, "Clicking on element size");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+Size+"']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on size " + e);
            logger.log(LogStatus.FAIL, "Unable to click on size. Error " + e);
            getScreenShot(driver, "Size", logger);
        }//End of catch
    }//End of Size

    public void AddToBag (){
        Reusable_Actions_Loggers_POM.clickMethod(driver,AddToBag,logger,"Add to Bag");
    }//End of Add to bag

    public void ViewBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ViewBag,logger,"View bag");
    }//End of view bag




}//
