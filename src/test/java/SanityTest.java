import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.runtime.Thread;

public class SanityTest extends HomePage{

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
        driver.findElement(By.id("ao-clp-hero-with-search__where-input")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Iceland')]")).click();
        driver.findElement(By.id("ao-clp-hero-with-search__when-input")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Jun 21')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
        System.out.println(getDriver().getCurrentUrl());
        Assert.assertEquals("https://www.tourradar.com/d/iceland#month=june-2021",driver.getCurrentUrl());
    }


}
