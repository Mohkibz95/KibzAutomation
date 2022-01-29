package Practice_Coding;

import Day9_01082022.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BNY_MellonPractice {

    WebDriver driver;
    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
        //Navigate to BNYMellon
        driver.navigate().to("https://WWW.BNYMellon.com");
    }//End of pre-condition


    @Test(priority = 1)
    public void BNYMellon() throws InterruptedException {
        //Verify title
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("BNY Mellon | Consider Everything")){
            System.out.println("Title matches as 'BNY Mellon | Consider Everything'");
        }else {
            System.out.println("Title does not match. Actual title is " + actualTitle);
        }//End of if else

        //Cancel pop-up
        Reusable_Actions.clickMethod(driver,"//*[@id='onetrust-close-btn-container']","Cancel Pop-Up");
        //Click on Investor Relations
      // class="dynamic-link aem-GridColumn aem-GridColumn--default--12"
        Reusable_Actions.MultipleclickMethod(driver,"//*[class='dynamic-link aem-GridColumn aem-GridColumn--default--12']",2,"Investor Relations");








driver.manage().deleteAllCookies();
    }//End of test 1
}//End of Class
