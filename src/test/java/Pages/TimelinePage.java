package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimelinePage {
    WebDriver driver;

    public TimelinePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarnoPensamento() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/label[@class='placeholder']")).click();
    }

 }

















//div/label[@class='placeholder']