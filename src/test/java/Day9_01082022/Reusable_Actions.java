package Day9_01082022;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Actions {
//create a resuable method for WebDriver and ChromeOptions
    public static WebDriver setDriver(){

        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
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

        return driver;

    }//end of webDriver

    //Creating void scrolling method for any web element

    public  static void scrollMethod(WebDriver driver, String x, String y, String scroll){
        System.out.println("Able to " + scroll);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll("+x+","+y+")");
        }catch (Exception e){
            System.out.println("Unable to " + scroll + " Error:" + e);
        }//End of try
    }//End of scroll



    public static void SelectMethod(WebDriver driver, String xpath, String userData, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Selecting element " + elementName);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to select  " + elementName + "Error:" + e);
        }//End of try
    }//end of Select by text method

    public static void dropDownByText(WebDriver driver, String xpath, String userValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Selecting value " + userValue + " from element " + elementName);
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            Select dDown = new Select(element);
            dDown.selectByVisibleText(userValue);
        } catch (Exception e) {
            System.out.println("Unable to select value from element " + elementName + " --" + e);
        }
    }//end of Select by text method

    //click on element using explicit wait with index
    public static void clickByIndex(WebDriver driver, String xpath, int indexNumber, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking by index " + elementName);
        try{
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(indexNumber).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " Error:" + e);
        }//End of try
    }//end of click method

    //creating void click method for any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
        }
    }//end of click method

    //creating void multiple click methods
    public static void MultipleclickMethod(WebDriver driver, String xpath, Integer number, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))).get(number).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
        }
    }//end of click method




    //creating void submit method for any web element
    public static void submitMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to Submit on " + elementName + " Error:" + e);
        }
    }//end of Submit method


    //creating void send keys method for any web element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userData, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Typing on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //clear first
            element.clear();
            //enter user data
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to type on " + elementName + " Error:" + e);
        }
    }//end of click sendKeysMethod

    //hovering over an element using mouse Actions
    public static void mouseHover(WebDriver driver, String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,15);
        Actions mouseHover = new Actions(driver);
        try{
            System.out.println("Hovering to element " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            mouseHover.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover to element " + elementName + " --" + e);
        }
    }//end of mouse hover method


    //creating return getText method for any text web element
    public static String getTextMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Capturing text on element " + elementName);
        //declare a global variable to capture the text so I can return it
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on " + elementName + " Error:" + e);
        }
        return result;
    }//end of click getTextMethod









}
