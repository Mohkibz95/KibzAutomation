package Express_Page_Object;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class


    //create static reference for Express home page
    public static ExpressHomePage expressHomePage(){
        ExpressHomePage expressHomePage = new ExpressHomePage(driver);
        return  expressHomePage;
    }//

    //Create static for Women Dresses
    public static WomenDresses womenDresses(){
        WomenDresses womenDresses = new WomenDresses(driver);
        return womenDresses;
    }//

    //Create static for Bag page
    public static BagPage bagPage(){
        BagPage bagPage = new BagPage(driver);
        return bagPage;
    }//

    //Create static for Bag page
    public static QuantityPage quantityPage(){
        QuantityPage quantityPage = new QuantityPage(driver);
        return quantityPage;
    }//

    //Create static for Check oUt page
    public static CheckOutPage checkOutPage(){
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        return checkOutPage;
    }//


}//End of Class
