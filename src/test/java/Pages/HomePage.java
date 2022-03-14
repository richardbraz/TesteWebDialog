package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTimeline() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li/a/i[@class='material-icons undefined'][normalize-space()='article']")).click();
    }
}