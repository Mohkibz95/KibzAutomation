package Action_Item;

import Day9_01082022.Reusable_Actions;
import Hulu_Page_Object.BaseClass;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_POM extends Reusable_Annotations {


    @Test(priority = 1)
    public void HuluLoop(){

        ArrayList<String> EmailAddress = new ArrayList<>();
        EmailAddress.add("Kibz_1997@gmail.com");
        EmailAddress.add("Timmy.Coogan92@gmail.com");

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

        for (int i = 0; i < EmailAddress.size(); i++) {
            //Navigate to hulu.com
            driver.navigate().to("https://www.hulu.com");

            //Verify title 'Streams TV and Movies'
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies")) {
                System.out.println("Title matches as 'Stream TV and Movies Live and Online | Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//

            //Scroll to the view by pixels
            Reusable_Actions.scrollMethod(driver, "0", "3250", "scroll");

            //Navigate to hulu
            BaseClass.huluHomePage().HuluPlan();

            //Account info
            BaseClass.accountInfoPage().Email(EmailAddress.get(i));
            BaseClass.accountInfoPage().PassWord(Password.get(i));
            BaseClass.accountInfoPage().FirstName(Name.get(i));
            BaseClass.accountInfoPage().clickMonth();
            BaseClass.accountInfoPage().SelectMonth(Month.get(i));
            BaseClass.accountInfoPage().ClickDay();
            BaseClass.accountInfoPage().SelectDay(Day.get(i));
            BaseClass.accountInfoPage().ClickYear();
            BaseClass.accountInfoPage().SelectYear(Year.get(i));
            BaseClass.accountInfoPage().ClickGender();
            BaseClass.accountInfoPage().SelectGender(Gender.get(i));
            BaseClass.accountInfoPage().ClickContinue();

            //Billing Page
           String MonthlyResult = BaseClass.billingPage().Subscription();
            System.out.println("My subscription monthly is " + MonthlyResult);

            String DueResult = BaseClass.billingPage().DueToday();
            System.out.println("My result is " + DueResult);

            driver.manage().deleteAllCookies();
        }//End of for loop
    }//End of test



    @Test(dependsOnMethods="HuluLoop")
    public void LogIn() {
        //Navigate to hulu
        driver.navigate().to("https://www.hulu.com");


        //Relogin
        BaseClass.reloginPage().ClickLogIn();
        BaseClass.reloginPage().EmailID("Kibz_1997@gmail.com");
        BaseClass.reloginPage().PasswordID("Mgkstacks@1995");
        BaseClass.reloginPage().LOGIN();

        //Verify username

        String Username = BaseClass.userNamePage().UserName();
        System.out.println("The username is " + Username);


    }//End of test 2
}//End of class
