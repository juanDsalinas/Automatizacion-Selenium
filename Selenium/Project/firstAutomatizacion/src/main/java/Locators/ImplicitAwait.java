package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitAwait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\Project\\firstAutomatizacion\\src\\main\\resources\\driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        try {
            WebElement btn = driver.findElement(By.id("visibleAfter"));
            btn.click();
            System.out.println("CLICK REY");
        } catch (Exception e){
            System.out.println(e);
        }

        // driver.close();


    }
}
