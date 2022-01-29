package Action_Item;

import Day9_01082022.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WeightWatchers_UsingReusableMethods {
    WebDriver driver;
    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
    }//End of pre-condition
    @Test(priority = 1)
    public void WeightWatchers() throws InterruptedException {

        //Setting array list
        ArrayList<String> Zipcodes = new ArrayList<>();
        Zipcodes.add("10467");
        Zipcodes.add("11435");
        Zipcodes.add("10594");

        //Set the web driver
        //Set for loop
        for (int i = 0; i < Zipcodes.size(); i++) {

            //Navigate to weight watchers
            driver.navigate().to("https://WWW.weightwatchers.com");

            //Verify title for Weight watchers
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("WW's Most Personalized Weight Loss Program Ever | WW USA")) {
                System.out.println("Title matches as 'Weight Watchers'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//End of if else

            //Click on dropdown
            Reusable_Actions.clickMethod(driver, "//*[@class='MenuItem_menu-item__angle-wrapper__1XaUv']", "Menu Item");
            //Click on unlimited workshops
            Reusable_Actions.clickMethod(driver, "//*[@class='MenuItem_subtitle__3LoiE']", "Unlimited workshops");
            //Click on Studio Links
            Reusable_Actions.clickMethod(driver,"//*[@class='buttonWrapper-QK2gi']","Studio Links");
            //Enter zipcodes
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='location-search']",Zipcodes.get(i),"Zipcodes");
            //Click on search Arrow
            Reusable_Actions.submitMethod(driver,"//*[@id='location-search-cta']","Search Arrow");
            //Set a time for each page
            Thread.sleep(2000);

            //click on specific links for the studios
            // storing WebElement as list for find elements
            try {
                List<WebElement> links = driver.findElements(By.xpath("//*[@class='container-3SE46']"));
                //set conditions
                if (i == 0) {
                    links.get(2).click();
                } else if (i == 1) {
                    links.get(1).click();
                } else if (i == 2) {
                    links.get(0).click();
                }//end of conditions
            }catch (Exception e){
                System.out.println("Unable to click on specific links "+e);
            }//end of links for studios exception

            Thread.sleep(2000);
            //Capture the address and store it as a Variable

            String Address = Reusable_Actions.getTextMethod(driver,"//*[@class='address-2PZwW']","Address");
            String[] arrayAddress = Address.split("Studio");
            System.out.println("My studio address near " + Zipcodes.get(i) + " is " + arrayAddress[0]);

            //Scroll to the Studio Hours
            Reusable_Actions.scrollMethod(driver,"0","450","scroll");

            Thread.sleep(2000);

            //Click on Business Hours
            Reusable_Actions.clickMethod(driver,"//*[text()='Business hours']","Business Hours");
            //Capture the Schedule timings or business hours
            String Schedule = Reusable_Actions.getTextMethod(driver,"//*[@class='hoursWrapper-1KHIv show-1db4o']","Schedule");
            System.out.println("The schedule timings for " + Zipcodes.get(i) + " is " + Schedule);
        }//End of for loop
    }//End of Test 1
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }
}//End of Class
