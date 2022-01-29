package Hulu_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInfoPage extends Reusable_Annotations {
    public AccountInfoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//

    @FindBy(xpath = "//*[@id='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@id='password']")
    WebElement Password;
    @FindBy(xpath = "//*[@id='firstName']")
    WebElement FirstName;
    @FindBy(xpath = "//*[text()='Month']")
    WebElement Month;
    @FindBy(xpath = "//*[@id='birthdayMonth-menu']")
    WebElement BirthMonth;
    @FindBy(xpath = "//*[text()='Day']")
    WebElement Day;
    @FindBy(xpath = "//*[@id='birthdayDay-menu']")
    WebElement BirthDay;
    @FindBy(xpath = "//*[text()='Year']")
    WebElement Year;
    @FindBy(xpath = "//*[@id='birthdayYear-menu']")
    WebElement BirthYear;
    @FindBy(xpath = "//*[text()='Select']")
    WebElement Gender;
    @FindBy(xpath = "//*[@id='gender-menu']")
    WebElement SelectGender;
    @FindBy(xpath = "//*[text()='CONTINUE']")
    WebElement Continue;

    public void Email(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,userData,logger,"Email");
    }//End

    public void PassWord(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Password,userData,logger,"Password");
    }//End
    public void FirstName(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,FirstName,userData,logger,"First Name");
    }//End
    public void clickMonth(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Month,logger,"Click Month");
    }//End
    public void SelectMonth(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthMonth,userData,logger,"Birth Month");
    }//End
    public void ClickDay(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Day,logger,"Day");
    }//End
    public void SelectDay(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthDay,userData,logger,"Birth Day");
    }//End
    public void ClickYear(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Year,logger,"Year");
    }//End
    public void SelectYear(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,BirthYear,userData,logger,"Birth Year");
    }//End
    public void ClickGender(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Gender,logger,"Gender");
    }//End
    public void SelectGender(String userData){
        Reusable_Actions_Loggers_POM.SelectMethod(driver,SelectGender,userData,logger,"Select Gender");
    }//End
    public void ClickContinue(){
        Reusable_Actions_Loggers_POM.submitMethod(driver,Continue,logger,"Continue");
    }//End


















}//End of class
