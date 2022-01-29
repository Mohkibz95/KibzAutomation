package Practice_Coding;

import Day9_01082022.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_Automation_Selenium {
    public static void main(String[] args) throws InterruptedException {

      WebDriver driver = Reusable_Actions.setDriver();

      driver.navigate().to("https://www.usps.com");

        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if(actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//


        //declare mouse actions
        Reusable_Actions.mouseHover(driver,"//*[text()='Send']","Send Tab");
        ////*[text()='Look Up a ZIP Code']
        Reusable_Actions.mouseHover(driver,"//*[text()='Look Up a ZIP Code']","ZipCode lookUp");
        Reusable_Actions.clickMethod(driver,"//*[text()='Look Up a ZIP Code']","ZipCode LookUp");
















    }//end of main
}//end of class
