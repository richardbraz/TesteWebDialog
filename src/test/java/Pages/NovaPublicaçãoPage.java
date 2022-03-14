package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NovaPublicaçãoPage {
    WebDriver driver;

    public NovaPublicaçãoPage (WebDriver driver){
        this.driver = driver;
    }

    public void clicarCamera() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='postMedia']")).click();

    }
}
