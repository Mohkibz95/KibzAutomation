package Hulu_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserNamePage extends Reusable_Annotations {
    public UserNamePage(WebDriver driver){
        PageFactory.initElements(driver,this);
       this.logger =Reusable_Annotations.logger;
    }//End


    @FindBy(xpath = "//*[text()='Kibria']")
    WebElement Kibria;


    public String UserName(){
        String UserName = Reusable_Actions_Loggers_POM.getTextMethod(driver,Kibria,logger,"Kibria");
        return UserName;
    }//End


}//End
