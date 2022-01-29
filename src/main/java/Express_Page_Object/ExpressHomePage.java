package Express_Page_Object;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExpressHomePage extends Reusable_Annotations {

    ExtentTest logger;
    public ExpressHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath ="//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
            WebElement NavigatetoWomen;
    @FindBy(xpath ="//*[@href='/womens-clothing/dresses/cat550007']")
    WebElement Dresses;

    //create a pom method to get the link count for the list
    public void HoverToWomen(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,NavigatetoWomen,logger,"Women");
    }//End of Hover

    public void ClickDresses(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Dresses,logger,"Dresses");
    }//End of ClickDresses







}//End of Class
