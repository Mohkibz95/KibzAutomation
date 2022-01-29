package Action_Item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class Optional_ActionItem_Aetna {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> Zipcodes = new ArrayList<>();
        Zipcodes.add("10467");
        Zipcodes.add("11435");
        Zipcodes.add("10594");

        ArrayList<Integer> milesRange = new ArrayList<>();

        milesRange.add(25);
        milesRange.add(50);
        milesRange.add(10);

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i< Zipcodes.size();i ++){



            //navigate to aetna website
            driver.navigate().to("https://www.aetna.com");
            Thread.sleep(1000);

            try {
               WebElement FAP = driver.findElement(By.xpath("//*[text()='Shop for a plan']"));
               FAP.click();
            }catch (Exception e){
                System.out.println("Unable to click FAP " +e);
            }//End of try
            Thread.sleep(1000);

            try {
                WebElement Medi = driver.findElement(By.xpath("//*[text()='Medicare']"));
                Medi.click();
            }catch (Exception e){
                System.out.println("Unable to print Medicare " +e);
            }//End of try
            Thread.sleep(1000);

            try {
                WebElement FAD = driver.findElement(By.xpath("//*[contains(text(),'Find a doctor')]"));
                FAD.click();
            }catch (Exception e){
                System.out.println("Unable to print FAD" +e);
            }//End of try
            Thread.sleep(1000);

            try {
                WebElement PlansYouPurchase = driver.findElement(By.xpath("//*[text()='2021 Medicare plans you purchase yourself']"));
                PlansYouPurchase.click();
            }catch (Exception e){
                System.out.println("Unable to find your plan " +e);
            }//End of try
            Thread.sleep(1000);

            try {
                WebElement MedZip = driver.findElement(By.xpath("//*[@id='medZip']"));
                MedZip.clear();
                MedZip.sendKeys(Zipcodes.get(i));
            }catch (Exception e){
                System.out.println("Unable to print Zipcodes " +e);
            }//End of try
            Thread.sleep(2500);

            try {
                WebElement slider = driver.findElement(By.xpath("//*[@ng-style='minPointerStyle']"));

                Actions action = new Actions(driver);

                action.click(slider).build().perform();
                //moving the slider   //back to 0 since default is 25 miles
                Thread.sleep(1000);
                for (i = 0; i < 25;i++) {
                    action.sendKeys(Keys.ARROW_LEFT).build().perform();

                }//end of loop

//now moving the slider to desired milesRange
                for (i = i; i < milesRange.get(i); i++) {
                    action.sendKeys(Keys.ARROW_RIGHT).build().perform();
                }

            } catch (Exception e) {
                System.out.println("Unable to move the slider" + e);
            } // end of slider


















            /*


            try {
                WebElement ClickZip = driver.findElement(By.xpath("//*[@ng-attr-title='{{match.label}}']"));
                ClickZip.click();
            }catch (Exception e){
                System.out.println("Unable to click " +e);
            }//End of try
            Thread.sleep(2000);


                WebElement MilesRangeSlider = driver.findElement(By.xpath("//*[@class='rz-pointer rz-pointer-min']"));
                MilesRangeSlider.click();
                for (i =0; i <25; i++){
                    MilesRangeSlider.sendKeys(Keys.ARROW_LEFT);
                }//End of loop MilesrangerSlider

               int Mile = 50;
                for (i = 0; i <Mile; i++){

                    MilesRangeSlider.sendKeys(Keys.ARROW_RIGHT);
                    try {
                        driver.findElement(By.xpath("//*[text()='Skip plan selection*']")).click();
                    } catch (Exception e) {
                        System.out.println("Unable to click on Skip Plan selection");
                    }//end of exception


                }//End of loop

*/





















        }//End for loop

    }//End of main
}//End of Class
