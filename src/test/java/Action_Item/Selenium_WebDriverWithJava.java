package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_WebDriverWithJava {

    public static void main(String[] args) throws InterruptedException {

//Search multiple hobbies and each time capture the search number from the results page
        //Set an Array

        String[] hobbies = new String[6];
        hobbies[0] = "Tennis";
        hobbies[1] = "Football";
        hobbies[2] = "Boxing";
        hobbies[3] = "Chess";
        hobbies[4] = "Soccer";
        hobbies[5] = "Bowling";

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < hobbies.length; i++){

                //Simply open up bing website
            driver.navigate().to("https://www.bing.com");



            //Maximize my browser
           // driver.manage().window().fullscreen();

            //Should wait for a few seconds
            Thread.sleep(3000);

            //Searching for hobbies on search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies[i]);

            //Hit Submit on Bing search button
            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();


            //Should wait for a few seconds
            Thread.sleep(3000);

            //Capture the search result and store it as a variable
           String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            //Declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //Now print the search number only
           System.out.println("My search number for " + hobbies[i] + " is " + arrayResult[0]);



        }//End of for loop
        //Driver.quit
        //driver.close();



    }//End of Main
}//End of Class
