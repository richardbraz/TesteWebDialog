package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NovaPublicaçãoPosVideoPage {
    WebDriver driver;

    public NovaPublicaçãoPosVideoPage (WebDriver driver){
        this.driver = driver;
    }
    public void clicarPublicar() throws InterruptedException{

        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[@class='sc-jeraig lJAZ btn btnSmall']")).click();
    }

}
