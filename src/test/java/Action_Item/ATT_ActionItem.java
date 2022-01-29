package Action_Item;

import Day9_01082022.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ATT_ActionItem {
    WebDriver driver;
    //your extent report and extent test command should be declared outside,so it can be reusable among all annotations
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Apple_iPhone_Report.html",true);
    }//end of precondition

    @Test
    public void ExpressDataDriven() throws BiffException, IOException, WriteException, InterruptedException {

        logger = reports.startTest("Shop for iphone 13");

        //Step 1: read the data from the excel sheet you created
        Workbook OriginalApple = Workbook.getWorkbook(new File("src/main/resources/ExcelQA.xls"));
        //Step 2: locating the worksheet that you created for the workbook
        //Two ways of calling the Sheet. Either as integer or String.
        //Sheet ExpressSheet = OriginalExpress.getSheet(2);
        Sheet AppleSheet = OriginalApple.getSheet("Apple");
        //will return the physical rows present on the sheet
        int rowCount = AppleSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook CopyApple = Workbook.createWorkbook(new File("src/main/resources/ExcelQA_Results.xls"), OriginalApple);
        // WritableSheet CopyExpressSheet = CopyExpress.getSheet(2);
        WritableSheet CopyAppleSheet = CopyApple.getSheet("Apple");

        //will return the physical rows present on the sheet
        int rowCount2 = CopyAppleSheet.getRows();
        System.out.println("My Copy Apple row count is " + rowCount2);

        //generate the for/while loop
        for(int i = 1; i < rowCount2;i++) {


            //store the countries list as a variable
            //Imagine x,y, same as column,Rows
            String Colors = CopyAppleSheet.getCell(0,i).getContents();
            System.out.println("My values are " + Colors);

            String PhoneNumber = CopyAppleSheet.getCell(1,i).getContents();
            System.out.println("My values are " + PhoneNumber);

            String Last4Digits = CopyAppleSheet.getCell(2,i).getContents();
            System.out.println("My values are " + Last4Digits);


            //navigate to Apple
            driver.navigate().to("https://www.Apple.com");
            //Verify Title for Express 'Men's and Women's clothing'
            String actualTitle = driver.getTitle();
            if(actualTitle.equals("Apple")){
                System.out.println("Title matches as 'Apple'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//End of if else

            //Click on the iPhone
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@class='ac-gn-link ac-gn-link-iphone']",logger,"iPhone");
            //Click on iPhone 13 pro
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Buy']",logger,"iPhone 13 pro");
            //Click on 13 pro max option class="rc-dimension-selector-row form-selector"
            Reusable_Actions_Loggers.clickByIndex(driver,"//*[@class='rc-dimension-selector-row form-selector']",1,logger,"13 pro max");
            //Click on colors
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+Colors+"']",logger,"Colors");
            Thread.sleep(2000);
            //Click on 128 GB class="form-selector-label" class=""
            Reusable_Actions_Loggers.clickByIndex(driver,"//*[@class='rc-dimension-multiple form-selector-threeline column large-6 small-6 form-selector']",0,logger,"13 pro max");





        }//End of for loop


    }//End of test 1

}//End of AT&T Class
