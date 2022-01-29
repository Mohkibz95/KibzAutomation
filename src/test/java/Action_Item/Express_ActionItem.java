package Action_Item;

import Day9_01082022.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_ActionItem extends Reusable_Annotations {


    @Test
    public void ExpressDataDriven() throws BiffException, IOException, WriteException, InterruptedException {



        //Step 1: read the data from the excel sheet you created
        Workbook OriginalExpress = Workbook.getWorkbook(new File("src/main/resources/ExcelQA.xls"));
        //Step 2: locating the worksheet that you created for the workbook
        //Two ways of calling the Sheet. Either as integer or String.
        //Sheet ExpressSheet = OriginalExpress.getSheet(1);
        Sheet ExpressSheet = OriginalExpress.getSheet("EXPRESS");
        //will return the physical rows present on the sheet
        int rowCount = ExpressSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook CopyExpress = Workbook.createWorkbook(new File("src/main/resources/ExcelQA_Results.xls"),OriginalExpress);
       // WritableSheet CopyExpressSheet = CopyExpress.getSheet(1);
       WritableSheet CopyExpressSheet = CopyExpress.getSheet("EXPRESS");

        //will return the physical rows present on the sheet
        int rowCount2 = CopyExpressSheet.getRows();
        System.out.println("My Copy Express row count is " + rowCount2);

        //generate the for/while loop
        for(int i = 1; i < rowCount2;i++) {

            //store the countries list as a variable
            //Imagine x,y, same as column,Rows
            String Size = CopyExpressSheet.getCell(0,i).getContents();
            System.out.println("My values are " + Size);

            String Quantity = CopyExpressSheet.getCell(1,i).getContents();
            System.out.println("My values are " + Quantity);

            String FirstName = CopyExpressSheet.getCell(2,i).getContents();
            System.out.println("My values are " + FirstName);

            String LastName = CopyExpressSheet.getCell(3,i).getContents();
            System.out.println("My values are " + LastName);

            String Email = CopyExpressSheet.getCell(4,i).getContents();
            System.out.println("My values are " + Email);

            String Phone = CopyExpressSheet.getCell(5,i).getContents();
            System.out.println("My values are " + Phone);

            String Address = CopyExpressSheet.getCell(6,i).getContents();
            System.out.println("My values are " + Address);

            String Zip = CopyExpressSheet.getCell(7,i).getContents();
            System.out.println("My values are " + Zip);

            String City = CopyExpressSheet.getCell(8,i).getContents();
            System.out.println("My values are " + City);

            String State = CopyExpressSheet.getCell(9,i).getContents();
            System.out.println("My values are " + State);

            String CardNumber = CopyExpressSheet.getCell(10,i).getContents();
            System.out.println("My values are " + CardNumber);

            String ExpMonth = CopyExpressSheet.getCell(11,i).getContents();
            System.out.println("My values are " + ExpMonth);

            String ExpYear = CopyExpressSheet.getCell(12,i).getContents();
            System.out.println("My values are " + ExpYear);

            String CVV = CopyExpressSheet.getCell(13,i).getContents();
            System.out.println("My values are " + CVV);

            logger.log(LogStatus.INFO,"Navigate to express home page");

            //navigate to Express
            driver.navigate().to("https://www.express.com");
            //Verify Title for Express 'Men's and Women's clothing'
            String actualTitle = driver.getTitle();
            if(actualTitle.equals("Men's and Women's clothing")){
                System.out.println("Title matches as 'Stream TV and Movies Live and Online | Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//End of if else

            //Hover on Women's tab
            Reusable_Actions_Loggers.mouseHover(driver,"//*[text()='Women']",logger,"Women");
            //Click on dress link
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Dresses']",logger,"Dresses");
            //Wait few seconds
            Thread.sleep(2000);
            //Scroll down
            Reusable_Actions.scrollMethod(driver,"0","675","scroll");
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='bluecoreCloseButton']",logger,"Cancel Pop-up");
            //Click on second Image
            Reusable_Actions_Loggers.clickByIndex(driver,"//*[@class='cdS1D9eKI7bXTMHp5xeAA']",2,logger,"Second Image");
            Thread.sleep(2000);
            //Click on sizes
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+Size+"']",logger,"Size");
            Reusable_Actions.scrollMethod(driver,"0","450","scroll");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Add to Bag");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",logger,"View Bag");
            Reusable_Actions.scrollMethod(driver,"0","450","scroll");
            Thread.sleep(2000);
            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@class='dropdown__select _3sadDDi3 inputInactive Sx8uIkYS']",Quantity,logger,"Quantity");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",logger,"Checkout");
            Thread.sleep(2000);
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",logger,"Checkout as Guest");
            Thread.sleep(2000);
            //Enter first name
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='firstname']",logger,"First Name");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='firstname']", FirstName ,logger,"First Name");
            //Enter last name
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='lastname']",logger,"Last Name");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']", LastName ,logger,"Last Name");
            //Enter email
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='email']",logger,"Email");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']", Email ,logger,"email");
            //Confirm email
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='confirmEmail']",logger,"confirmEmail");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']", Email ,logger,"confirmEmail");
            //Enter number
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='phone']",logger,"phone");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']", Phone ,logger,"phone");
            //Click continue
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");
            //Click on address
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.line1']",logger,"Address");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']", Address ,logger,"Address");
            //Enter zip code
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.postalCode']",logger,"Zip");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']", Zip ,logger,"Zip");
            //Enter city
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.city']",logger,"city");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']", City ,logger,"city");
            //Enter state select visible text
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='shipping.state']",logger,"clicking state");
            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='shipping.state']",State,logger,"state");
            //Click on continue
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");
            //Enter credit card info name=""
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='creditCardNumber']",logger,"creditCardNumber");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='creditCardNumber']", CardNumber ,logger,"creditCardNumber");
            //Click on expMonth name="expMonth"
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expMonth']",logger,"expMonth ");
            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='expMonth']",ExpMonth,logger,"expMonth");
            //click on exp year
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expYear']",logger,"ExpYear ");
            Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='expYear']",ExpYear,logger,"ExpYear");
            //Enter CVV name="cvv"
           // Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='cvv']",logger,"cvv");
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='cvv']", CVV ,logger,"cvv");
            //Click Place Order
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",logger,"Place order");
            //Capture the error results id="rvn-note-NaN"
            String Errorresults = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@id='rvn-note-NaN']",logger,"Search Result");
            System.out.println("Error is " + Errorresults);


            //Step 5: storing the values to the writable excel sheet
            Label label = new Label(14,i,Errorresults);
            //I need to write back to the writable sheet
            //Below is the line for code where we tell the program where to write each of the results to
            CopyExpressSheet.addCell(label);
            //end the logger
            //reports.endTest(logger);
            //Delete all cookies
            driver.manage().deleteAllCookies();
        }//end of loop
      //Step 6: writing back to the writable file to see
        CopyExpress.write();//Save to excel copy file
        CopyExpress.close();//Close
        driver.quit();
    }//End of Test 1
}//End of Class
