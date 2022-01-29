package Day7_12252021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mortgage_ScrollingbyElement {

    public static void main(String[] args) throws InterruptedException {

        //webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //start maximized
        options.addArguments("start-maximized");
        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");
        //driver.manage().window().fullscreen();
        Thread.sleep(2500);

        //scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by element 'Home Value' text
        //declare as web element
        WebElement homeValueText = driver.findElement(By.xpath("//*[contains(text(),'Home Value:')]"));

        jse.executeScript("arguments[0].scrollIntoView(true);", homeValueText);

        Thread.sleep(3000);


        //close browser
       //driver.quit();

    }//End of main
}//End of class
