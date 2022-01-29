package Action_Item;

import Day9_01082022.Reusable_Actions;
import Express_Page_Object.BaseClass;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_POM extends Reusable_Annotations {



//kibria


    @Test
    public void Express_Buying_A_Dress()throws BiffException, IOException, WriteException, InterruptedException{

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
            String Size = CopyExpressSheet.getCell(0, i).getContents();
            System.out.println("My values are " + Size);

            String Quantity = CopyExpressSheet.getCell(1, i).getContents();
            System.out.println("My values are " + Quantity);

            String FirstName = CopyExpressSheet.getCell(2, i).getContents();
            System.out.println("My values are " + FirstName);

            String LastName = CopyExpressSheet.getCell(3, i).getContents();
            System.out.println("My values are " + LastName);

            String Email = CopyExpressSheet.getCell(4, i).getContents();
            System.out.println("My values are " + Email);

            String Phone = CopyExpressSheet.getCell(5, i).getContents();
            System.out.println("My values are " + Phone);

            String Address = CopyExpressSheet.getCell(6, i).getContents();
            System.out.println("My values are " + Address);

            String Zip = CopyExpressSheet.getCell(7, i).getContents();
            System.out.println("My values are " + Zip);

            String City = CopyExpressSheet.getCell(8, i).getContents();
            System.out.println("My values are " + City);

            String State = CopyExpressSheet.getCell(9, i).getContents();
            System.out.println("My values are " + State);

            String CardNumber = CopyExpressSheet.getCell(10, i).getContents();
            System.out.println("My values are " + CardNumber);

            String ExpMonth = CopyExpressSheet.getCell(11, i).getContents();
            System.out.println("My values are " + ExpMonth);

            String ExpYear = CopyExpressSheet.getCell(12, i).getContents();
            System.out.println("My values are " + ExpYear);

            String CVV = CopyExpressSheet.getCell(13, i).getContents();
            System.out.println("My values are " + CVV);


            //navigate to Express
            logger.log(LogStatus.INFO, "Navigating to Express home page");
            driver.navigate().to("https://www.express.com");

            //Verify Title for Express 'Men's and Women's clothing'
            String actualTitle = driver.getTitle();
            if(actualTitle.equals("Men's and Women's clothing")){
                System.out.println("Title matches as 'Stream TV and Movies Live and Online | Hulu'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }//End of if else

            //Navigate to Women and click on dresses
            BaseClass.expressHomePage().HoverToWomen();
            BaseClass.expressHomePage().ClickDresses();
            Reusable_Actions.scrollMethod(driver,"0","675","scroll");


            //BaseClass.womenDresses().CancelPopup();

            //Select image and cancel pop
           // BaseClass.womenDresses().Image();
            Reusable_Actions_Loggers.clickByIndex(driver,"//*[@class='JOmERbbC974crOskZ2A3DA==']",2,logger,"Second Image");
           // Reusable_Actions_Loggers.clickByIndex(driver,"//*[contains(@class,'-qIS3zH7eoemBZF9mo1K5')]",1,logger,"Second Dress");



            //Select Size
            BaseClass.bagPage().Size(Size);
            BaseClass.bagPage().AddToBag();
            BaseClass.bagPage().ViewBag();

            //Select Quantity
            BaseClass.quantityPage().SelectQuantity(Quantity);
            BaseClass.quantityPage().ClickCheckOut();
            BaseClass.quantityPage().ClickCheckGuest();

            //Select payment method and check out

            BaseClass.checkOutPage().FirstName(FirstName);
            BaseClass.checkOutPage().LastName(LastName);
            BaseClass.checkOutPage().Email(Email);
            BaseClass.checkOutPage().ConfirmEmail(Email);
            BaseClass.checkOutPage().Phone(Phone);
            BaseClass.checkOutPage().ClickContinue();
            BaseClass.checkOutPage().Address(Address);
            BaseClass.checkOutPage().Zip(Zip);
            BaseClass.checkOutPage().City(City);
            BaseClass.checkOutPage().State(State);
            BaseClass.checkOutPage().ClickContinue2();
            BaseClass.checkOutPage().ClickContinue3();
            BaseClass.checkOutPage().CardNumber(CardNumber);
            BaseClass.checkOutPage().ExpMonth(ExpMonth);
            BaseClass.checkOutPage().ExpYear(ExpYear);
            BaseClass.checkOutPage().CVV(CVV);
            BaseClass.checkOutPage().PlaceOrder();
            String result = BaseClass.checkOutPage().ErrorMessage();
            System.out.println("Error message is " + result);


            //Step 5: storing the values to the writable excel sheet
            Label label = new Label(14,i,result);
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
       // driver.quit();


    }//End of Test


}//End of Class
