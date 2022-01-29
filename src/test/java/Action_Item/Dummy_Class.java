package Action_Item;


import Day9_01082022.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
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

public class Dummy_Class {



        WebDriver driver;
        //your extent report and extent test command should be declared outside, so it can be reusable among all annotations
        ExtentReports reports;
        ExtentTest logger;

        @BeforeSuite
        public void SetTheDriver(){
            driver = Reusable_Actions.setDriver();
            //set the path of the report once
            reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html",true);
        }//end of precondition


        @Test()
        public void ExpresDataDrivenTest() throws BiffException, IOException, InterruptedException, WriteException {

            logger = reports.startTest("Express shop");
            //Step 1: read the data from the excel sheet you created
            Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
            //Step 2: locating the worksheet that you created for the workbook
            Sheet readableSheet = readableFile.getSheet(1);
            //will return the physical rows present on the sheet
            int rowCount = readableSheet.getRows();
            System.out.println("My row count is " + rowCount);

            //Step 3: create a writable file to mimic readable but you can also write back the results to this file
            WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"),readableFile);
            WritableSheet writableSheet = writableFile.getSheet(1);
            //will return the physical rows present on the sheet
            int rowCount2 = writableSheet.getRows();
            System.out.println("My writable row count is " + rowCount2);

            //generate the for
            for(int i=1; i< rowCount2;i++){
                //store the all KYC Excel list as a variable
                String Size = writableSheet.getCell(0,i).getContents();
                System.out.println("My values are " + Size);

                String Quantity = writableSheet.getCell(1,i).getContents();
                System.out.println("My values are " + Quantity);

                String FirstName = writableSheet.getCell(2,i).getContents();
                System.out.println("My values are " + FirstName);


                String LastName = writableSheet.getCell(3,i).getContents();
                System.out.println("My values are " + LastName);


                String Email = writableSheet.getCell(4,i).getContents();
                System.out.println("My values are " + Email);


                String PhoneNumber = writableSheet.getCell(5,i).getContents();
                System.out.println("My values are " + PhoneNumber);


                String Address = writableSheet.getCell(6,i).getContents();
                System.out.println("My values are " + Address);


                String Zipcode = writableSheet.getCell(7,i).getContents();
                System.out.println("My values are " + Zipcode);


                String City = writableSheet.getCell(8,i).getContents();
                System.out.println("My values are " + City);


                String State = writableSheet.getCell(9,i).getContents();
                System.out.println("My values are " + State);


                String CardNumber = writableSheet.getCell(10,i).getContents();
                System.out.println("My values are " + CardNumber);


                String ExpMonth = writableSheet.getCell(11,i).getContents();
                System.out.println("My values are " + ExpMonth);


                String ExpYear = writableSheet.getCell(12,i).getContents();
                System.out.println("My values are " + ExpYear);


                String CVV = writableSheet.getCell(13,i).getContents();
                System.out.println("My values are " + CVV);



                logger.log(LogStatus.INFO,"Navigate to Express home page");
                //Navigate to http://www.express.com
                driver.navigate().to("https://www.express.com");

                //Verify we are on following page title contains ‘Men’s and Women’s Clothing
                String actualTitle = driver.getTitle();
                if (actualTitle.equals("Men's and Women's Clothing")) {
                    System.out.println("Title matches as 'Men's and women's Clothing'");
                } else {
                    System.out.println("Title doesn't match. Actual title is " + actualTitle);
                }

                //Deal with pop-up

                //Reusable_Actions_Loggers.clickMethod(driver,"//*[@id='onetrust-accept-btn-handler']",logger,"close pop-up");


                //Hover on ‘Women’ tab using Actions
                Reusable_Actions_Loggers.mouseHover(driver,"//*[text()='Women']",logger,"Hover on women tab");


                //click on ‘Dresses’ link //use contains @href property or you can use texi() property!
                Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@href,'womens-clothing/dresses/cat550007')]", logger, "Dresses");


                //wait few seconds using Thread.sleep and Scroll about 400 to 500 pixels
                Thread.sleep(2500);

                Reusable_Actions.scrollMethod(driver,"0","450","scroll");

                //Click on second image //use @class property with index number as 1. you can use click Bylndex() method from your reusable
                Reusable_Actions_Loggers.clickByIndex(driver,"//*[@class='cdS1D9eKI7bXTMHp5xeAA']",1,logger,"clicking on second image");

                //wait few seconds on next page

                Thread.sleep(2500);

                //On size page click on specific size(choose different size each time on excel) and the value should be passed as a locator as text or value property.
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='"+Size+"']",logger,"Size");

                //Click on ‘Add to Bag’ button
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to Bag']",logger,"Clicking on adding to cart");

                //on pop up to the right side click on ‘View Bag’ tab then wait few seconds
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",logger,"Viewing Bag");

                // Select a quantity(choose different one each time
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='"+Quantity+"']",logger,"Size");

                //Click on ‘Checkout?’ button then wait few seconds
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout']",logger,"Clicking on checkout");
                Thread.sleep(3000);


                //on pop up click on ‘Continue as Guest’ button then wait few seconds
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Checkout as Guest']",logger,"checking out as a guest");

                //Enter first name
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='firstname']",FirstName,logger,"Entering First name");

                //Enter last name
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']",LastName,logger,"Entering Last name");

                //Enter email
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']",Email,logger,"Entering Email");

                //Confirm Email

                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']",Email,logger,"Entering Email");

                //Enter phone number(invalid numeric 10 digit number

                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']",PhoneNumber,logger,"Entering Email");

                //Click on ‘Continue’ button

                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"clicking on continue");

                //Enter address

                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']",Address,logger,"Entering Address");

                //Enter Zipcode

                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",Zipcode,logger,"Entering Zipcode");

                //Enter City
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']",City,logger,"Entering City");

                //click on state dropdown
                //Reusable_Actions_Loggers.clickMethod(driver,"//*[name='shipping.state']",logger,"clicking on state dropdown");
                //Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@id='shipping.state']",State,logger,"state");
                Thread.sleep(3000);


                //Click on Continue
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"clicking on continue");

                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"clicking on continue");

                //enter card number
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='creditCardNumber']",CardNumber,logger,"entering creditcardnumber");

                //selecting Exp Month
                Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expMonth']",logger,"expMonth");
                Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='expMonth']",ExpMonth,logger,"expMonth");

                //Select Exp Year
                Reusable_Actions_Loggers.clickMethod(driver,"//*[@name='expYear']",logger,"expMonth");
                Reusable_Actions_Loggers.selectByVisibleText(driver,"//*[@name='expYear']",ExpYear,logger,"ExpYear");

                //entering CVV code
                Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='cvv']",CVV,logger,"cvv");

                //Clicking on place order
                Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",logger,"Place Order");

                //capture error message and send it back to writable sheet

                String errorCode = Reusable_Actions_Loggers.getTextMethod(driver,"//*[text()='We experienced a problem submitting your payment. Please try again.']",logger,"Error Code");
                String[] code = errorCode.split(" ");
                // storing the values to the writable excel sheet
                Label label = new Label(14, i, code[1]);
                // write back to the writable sheet
                writableSheet.addCell(label);

                driver.manage().deleteAllCookies();

            }//end of for loop

            //Write back to writable file
            reports.endTest(logger);
            writableFile.write();
            writableFile.close();

        }//end of Test

        @AfterSuite
        public void endTest(){
            driver.quit();
            //write/log the informations back to the html report
            reports.flush();
        }//end of after suite
    }//

