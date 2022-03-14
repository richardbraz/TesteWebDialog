package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicacao(){
        driver.get("https://somosdialog-pwa.dialog.qa/login");
    }
    public void nomeUsuario() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/section[1]/form/div/div[1]/div/input")).sendKeys("qa@dialog.ci");
    }
    public void digitarSenha() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/section[1]/form/div/div[2]/div/input")).sendKeys("@jobqa123");
    }
    public void clicarEntrar() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/section[1]/form/button")).click();
    }

}

