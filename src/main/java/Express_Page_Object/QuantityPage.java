package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuantityPage extends Reusable_Annotations {
    ExtentTest logger;
    public QuantityPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@class='dropdown__select _3sadDDi3 inputInactive Sx8uIkYS']")
    WebElement Quantity;
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement CheckOut;
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckOutGuest;

    //create a pom method to get the link count for the list
    public void SelectQuantity(String userData){
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver,Quantity,userData,logger,"Quantity");
    }//End of Select

    public void ClickCheckOut(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckOut,logger,"Check Out");
    }//End of Click

    public void ClickCheckGuest(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckOutGuest,logger,"Check Out");
    }//End of Click Guest








}//End of class
