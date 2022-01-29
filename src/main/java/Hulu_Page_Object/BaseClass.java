package Hulu_Page_Object;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //Creating static
    public static HuluHomePage huluHomePage(){
        HuluHomePage huluHomePage = new HuluHomePage(driver);
        return huluHomePage;
    }//

    public static AccountInfoPage accountInfoPage(){
        AccountInfoPage accountInfoPage = new AccountInfoPage(driver);
        return accountInfoPage;
    }//

    public static BillingPage billingPage(){
        BillingPage billingPage = new BillingPage(driver);
        return billingPage;
    }//

    public static ReloginPage reloginPage(){
        ReloginPage reloginPage = new ReloginPage(driver);
        return reloginPage;
    }//

    public static UserNamePage userNamePage(){
        UserNamePage userNamePage = new UserNamePage(driver);
        return userNamePage;
    }//











}//End
