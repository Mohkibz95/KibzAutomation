package Hulu_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends Reusable_Annotations {

    public BillingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;

    }//

    @FindBy(xpath = "//*[text()='$6.99/mo']")
    WebElement Subscription;

    @FindBy(xpath = "//*[@class='ledger__summary']")
    WebElement DueToday;

    public String Subscription() {
        String MonthlyResult = Reusable_Actions_Loggers_POM.getTextMethod(driver, Subscription, logger, "Monthly Subscription");
        return MonthlyResult;
    }//End

    public String DueToday(){
        String DueResult = Reusable_Actions_Loggers_POM.getTextMethod(driver,DueToday,logger,"Due today");
        return DueResult;
    }//End




}//End of class
