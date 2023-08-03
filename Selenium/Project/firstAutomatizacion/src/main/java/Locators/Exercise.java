package Locators;

import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Exercise {
    public static void main(String[] args) {
        System.setProperty("wedriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\Project\\firstAutomatizacion\\src\\main\\resources\\driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.get("https://es-la.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("cheese");
        driver.findElement(By.id("pass")).sendKeys("paneton");
        WebElement btn= driver.findElement(By.className("login"));
        btn.submit();
    }
}
