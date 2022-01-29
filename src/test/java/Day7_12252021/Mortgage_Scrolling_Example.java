package Day7_12252021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.time.chrono.ChronoLocalDate;

public class Mortgage_Scrolling_Example {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //Start Maximized
        options.addArguments("start-maximized");
        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //Navigate to Mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");

        Thread.sleep(2500);

        //Scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //Scroll to the view by pixels
        jse.executeScript("scroll(0,450)");

    }//End of Main
}//End of Class
