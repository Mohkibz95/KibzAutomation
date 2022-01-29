package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Reusable_Annotations {

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@name='firstname']")
    WebElement FirstName;
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement Lastname;
    @FindBy(xpath = "//*[@name='email']")
    WebElement Email;
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement ConfirmEmail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement Phone;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement Address;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement Zip;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue2;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue3;
    @FindBy(xpath = "//*[@name='creditCardNumber']")
    WebElement CardNumber;
    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement ExpMonth;
    @FindBy(xpath = "//*[@name='expYear']")
    WebElement ExpYear;
    @FindBy(xpath = "//*[@name='cvv']")
    WebElement CVV;
    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement PlaceOrder;
    @FindBy(xpath = "//*[@id='rvn-note-NaN']")
    WebElement ErrorMessage;

    //create a pom method to get the link count for the list
    public void FirstName(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,FirstName,userData,logger,"First Name");
    }//End of First

    public void LastName(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Lastname,userData,logger,"Last Name");
    }//End of Last

    public void Email(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,userData,logger,"Email");
    }//End of Click

    public void ConfirmEmail(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,ConfirmEmail,userData,logger,"Confirm Email");
    }//End of Click Guest

    public void Phone(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Phone,userData,logger,"Phone");
    }//End of Click

    public void ClickContinue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"Check Out");
    }//End of Click Guest

    public void Address(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Address,userData,logger,"Address");
    }//End

    public void Zip(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Zip,userData,logger,"Zip");
    }//End

    public void City(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,City,userData,logger,"City");
    }//End

    public void State(String userData){
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver,State,userData,logger,"State");
    }//End

    public void ClickContinue2(){

        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue2,logger,"Continue");
    }//End
    public void ClickContinue3(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue3,logger,"Continue");
    }//End of Click Guest

    public void CardNumber(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CardNumber,userData,logger,"Card Number");
    }//End of Card Number

    public void ExpMonth(String userData){
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver,ExpMonth,userData,logger,"ExpMonth");
    }//End of ExpMonth

    public void ExpYear(String userData){
        Reusable_Actions_Loggers_POM.selectByVisibleText(driver,ExpYear,userData,logger,"ExpYear");
    }//End of ExpYear

    public void CVV(String userData){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CVV,userData,logger,"CVV");
    }//End of CVV

    public void PlaceOrder(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,PlaceOrder,logger,"Place Order");
    }//End of Place order

    public String ErrorMessage(){
        String result = Reusable_Actions_Loggers_POM.getTextMethod(driver,ErrorMessage,logger,"Error Message");

        return result;
    }//End of Error


}//End of class
