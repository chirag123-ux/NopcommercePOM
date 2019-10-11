package NopCommerceProject1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector  extends UtilsPage {
    public void setUpBrowser() {
        String browser = getProperty("Browser");

        //setup browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");

            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Browser name is empty or typed wrong:" + browser);
        }
    }
}