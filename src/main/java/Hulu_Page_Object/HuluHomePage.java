package Hulu_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HuluHomePage extends Reusable_Annotations {
    ExtentTest logger;
    public HuluHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    @FindBy(xpath = "//*[@aria-label='Get Hulu plan']")
    WebElement HuluPlan;



    public void HuluPlan(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,HuluPlan,logger,"Hulu Plan");
    }//End
















}//End of Class
