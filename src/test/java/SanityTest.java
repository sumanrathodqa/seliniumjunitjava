import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.runtime.Thread;

public class SanityTest extends HomePage{

    private static final By SEARCH_WHERE_TO = By.id("ao-clp-hero-with-search__where-input");
    private static final By SEARCH_INPUT = By.xpath("//div[contains(text(),'Iceland')]");
    private static final By SEARCH_WHEN = By.id("ao-clp-hero-with-search__when-input");
    private static final By SEARCH_WHEN_INPUT = By.xpath("//div[contains(text(),'Jun 21')]");
    private static final By SEARCH_BUTTON = By.xpath("//button[contains(text(),'Search')]");

  public SanityTest() {
   }

    @Test
    public void verifyUrl()  {

         //System.out.println(getDriver().getCurrentUrl());
        log.info(">---Test Case to -> verifyUrl--");
        Assert.assertEquals("https://www.tourradar.com/",driver.getCurrentUrl());

    }

    @Test
    public void searchTour() throws InterruptedException {
        log.info(">---Test Case to -> searchTour--");
        driver.findElement(SEARCH_WHERE_TO).click();
        driver.findElement(SEARCH_INPUT).click();
        driver.findElement(SEARCH_WHEN).click();
        driver.findElement(SEARCH_WHEN_INPUT).click();
        driver.findElement(SEARCH_BUTTON).click();
        System.out.println(getDriver().getCurrentUrl());
        Assert.assertEquals("https://www.tourradar.com/d/iceland#month=june-2021",driver.getCurrentUrl());
    }


}
