package Action_Item;

import Day9_01082022.Reusable_Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_ActionItem {

    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
    }//End of pre-condition

    @Test (priority = 1)
    public void HuluLoop(){
        ArrayList<String> EmailAddress = new ArrayList<>();
        EmailAddress.add("Ghulamk9950@gmail.com");
        EmailAddress.add("Tim.Coogan9950@gmail.com");

        ArrayList<String> Password = new ArrayList<>();
        Password.add("Mgkstacks@1995");
        Password.add("Mgkstacks@1995");

        ArrayList<String> Name = new ArrayList<>();
        Name.add("Kibria");
        Name.add("Coogan");

        ArrayList<String> Month = new ArrayList<>();
        Month.add("Sep");
        Month.add("Nov");

        ArrayList<String> Day = new ArrayList<>();
        Day.add("09");
        Day.add("28");

        ArrayList<String> Year = new ArrayList<>();
        Year.add("1995");
        Year.add("1993");

        ArrayList<String> Gender = new ArrayList<>();
        Gender.add("Male");
        Gender.add("Female");

        for (int i = 0; i < EmailAddress.size(); i++){
            //Navigate to hulu.com
            driver.navigate().to("https://www.hulu.com");

            //Verify title 'Streams TV and Movies'
            String actualTitle = driver.getTitle();
            if(actualTitle.equals("Stream TV and Movies")){
                System.out.println("Title matches as 'Stream TV and Movies Live and Online | Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//

            //Scroll to the view by pixels
            Reusable_Actions.scrollMethod(driver, "0", "3250", "scroll");

            //Click on most popular
            Reusable_Actions.clickMethod(driver, "//*[@aria-label='Get Hulu plan']", "Select most popular");

            //Click on email to input email address
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='email']", EmailAddress.get(i), "Email address");
            //Enter password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password']", Password.get(i), "Password");
            //Enter names id="firstName"
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='firstName']", Name.get(i), "Name");
            //Click month
            Reusable_Actions.clickMethod(driver, "//*[text()='Month']", "Month");
            //Select Month
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayMonth-menu']", Month.get(i),"Month");
            //Click Day
            Reusable_Actions.clickMethod(driver,"//*[text()='Day']", "Day");
            //Select Day
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayDay-menu']", Day.get(i),"Day");
            //Click Year
            Reusable_Actions.clickMethod(driver,"//*[text()='Year']", "Year");
            //Select Year
            Reusable_Actions.SelectMethod(driver,"//*[@id='birthdayYear-menu']", Year.get(i),"Year");
            //Click on Gender
            Reusable_Actions.clickMethod(driver,"//*[text()='Select']", "Gender");
            //Select Gender id="gender-menu"
            Reusable_Actions.SelectMethod(driver,"//*[@id='gender-menu']", Gender.get(i),"Gender");
            //Click or submit continue
            Reusable_Actions.submitMethod(driver,"//*[text()='CONTINUE']", "Continue");
            //Capture the subscription amount and print
            String Subscription = Reusable_Actions.getTextMethod(driver,"//*[text()='$6.99/mo']","Subscription");
            System.out.println("My subscription monthly is " + Subscription);
            //Capture the total due today is $0.00 and print the amount
            String amountDueToday = Reusable_Actions.getTextMethod(driver,"//*[@class='ledger__summary']","amountDueToday");
            System.out.println("My result is " + amountDueToday);
            //Delete all cookies
           driver.manage().deleteAllCookies();
        }//End of for loop
    }//End of test 1

        @Test(dependsOnMethods="HuluLoop")
                public void LogIn(){
        //Navigate to hulu
            driver.navigate().to("https://www.hulu.com");
        //Click Log In
            Reusable_Actions.clickMethod(driver,"//*[text()='Log In']","Log In");
            //Enter Email
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='email_id']","Ghulamk19950@gmail.com", "Email");
            //Enter Password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password_id']", "Mgkstacks@1995", "Password");
            //Click LOGIN
            Reusable_Actions.clickMethod(driver,"//*[text()='LOG IN']","Log In");
            //Verify username and print
            String userName = Reusable_Actions.getTextMethod(driver,"//*[text()='Kibria']","Username");
            System.out.println("The username is " + userName);
        }//End of Test 2
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }
}//End of class
