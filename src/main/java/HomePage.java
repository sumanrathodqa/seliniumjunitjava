import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    public static WebDriver driver;
    public static Logger log = LogManager.getLogger(HomePage.class);



    public HomePage() {
    }

    public WebDriver getDriver() {
        return driver;
    }

@BeforeClass
    public static void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.tourradar.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BasicConfigurator.configure();
        log.debug("this is a test debug log message");
        log.info(">---Browser initiated---");
        log.warn("this is a test warning log message");

    }

@AfterClass
    public static void tearDownBrowser() throws InterruptedException {
        driver.quit();
        log.info(">---Quit browser---");
    }

}
