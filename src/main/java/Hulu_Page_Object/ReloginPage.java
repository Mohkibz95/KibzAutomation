package Hulu_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReloginPage extends Reusable_Annotations {
    public ReloginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger =Reusable_Annotations.logger;
    }//End of construction method


    @FindBy(xpath = "//*[text()='Log In']")
    WebElement LogIn;
    @FindBy(xpath = "//*[@id='email_id']")
    WebElement EmailID;
    @FindBy(xpath = "//*[@id='password_id']")
    WebElement PasswordID;
    @FindBy(xpath = "//*[text()='LOG IN']")
    WebElement LOGIN;


    public void ClickLogIn(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,LogIn,logger,"Log in");
    }//End
    public void EmailID(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EmailID,userData,logger,"EmailID");
    }//
    public void PasswordID(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,PasswordID,userData,logger,"Password");
    }//
    public void LOGIN(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,LOGIN,logger,"LOGIN");
    }//End



}//
