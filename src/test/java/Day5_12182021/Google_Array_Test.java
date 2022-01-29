package Day5_12182021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Array_Test {
    public static void main(String[] args) throws InterruptedException {

        //Search multiple cities and each time capture the search number from the result page
        //set an array

        String[] boroughs = new String[4];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "The Bronx";
        boroughs[2] = "Queens";
        boroughs[3] = "Staten Island";



        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        for (int i =0; i < boroughs.length;i++){

            //simply open the google web site
            driver.navigate().to("https://www.google.com");

            //maximize my browser
            driver.manage().window().fullscreen();

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);


            //searching for cars on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(boroughs[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();

            //Another wait statement since we came to a new page(result page)
            Thread.sleep(3000);

            //Capture the search result and store it as a variable
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //Declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //Now print the search number only
            System.out.println("My search number for " + boroughs[i] + " is " + arrayResult[1]);


            //close it
           // driver.close();

        }//End of for loop
        driver.quit();

    }//End of Main
}//End of Class
