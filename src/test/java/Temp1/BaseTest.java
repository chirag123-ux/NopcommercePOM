package Temp1;

import NopCommerceProject1.BasePage;
import NopCommerceProject1.BrowserSelector;
import NopCommerceProject1.UtilsPage;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends UtilsPage {
    BrowserSelector browserSelector = new BrowserSelector();
    @BeforeMethod
    public  void setUpBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }

    @AfterMethod
    public  void closeBrowser(ITestResult result){

        if(ITestResult.FAILURE == result.getStatus()){

            takeScreenShot(result.getName());
        }
        //driver.quit();
    }



}
