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

public class WomenDresses extends Reusable_Annotations {

    ExtentTest logger;
    public WomenDresses(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='JOmERbbC974crOskZ2A3DA==']")
    WebElement Image;
    @FindBy(xpath = "//*[@name='bluecoreCloseButton']")
    WebElement ClickPopup;


    //create a pom method to get the link count for the list
    public void CancelPopup(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickPopup,logger,"Click pop");
    }//End of cancel pop up

    public void Image(){
        Reusable_Actions_Loggers_POM.clickByIndex(driver,Image,1,logger,"Image");
    }//End of image




















        }//End of class
