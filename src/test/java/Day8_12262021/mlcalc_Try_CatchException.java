package Day8_12262021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class mlcalc_Try_CatchException {
    public static void main(String[] args) throws InterruptedException {

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalc
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2500);

        //enter purchase price
        try {
            WebElement PPrice = driver.findElement(By.xpath("//*[@id='ma']"));
            PPrice.clear();
            PPrice.sendKeys("400000");
        }catch (Exception e){
            System.out.println("unable to type value on Purchase price " + e);
        }//End of purchase price exception

        //Click on show advance action
        try {
            driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        }catch (Exception e){
            System.out.println("unable to click on Show advanced options " + e);
        }//End of show advanced options exception

        //select start month

        try{
            WebElement sMonth =  driver.findElement(By.xpath("//*[@name='sm']"));
            Select sMonthDropdown = new Select(sMonth);
            sMonthDropdown.selectByVisibleText("Oct");
        }catch (Exception e){
            System.out.println("Unable to select value from start month list " + e);
        }//end of start month exception

        Thread.sleep(3000);

        driver.close();











    }//End of main
}//End of Class
