package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\Project\\firstAutomatizacion\\src\\main\\resources\\driver\\chromedriver-win64\\chromedriver.exe");
        // instanciando el navigator
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String username = "standard_user";
        String pass="secret_sauce";

        // ID
        WebElement usernameI = driver.findElement(By.id("user-name"));
        // WebElement password = driver.findElement(By.id("password"));
        //WebElement loginBtn = driver.findElement(By.id("login-button"));
        // WebElement register = driver.findElement(By.className(".product_sort_container"));
        // WebElement cake = driver.findElement();

        // ClassName
        WebElement loginBtn = driver.findElement(By.className("btn_action"));

        // Name
        // WebElement password = driver.findElement(By.name("password"));

        // xpath
        //WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        // css Selector
        WebElement password = driver.findElement(By.cssSelector("input#password"));

        usernameI.sendKeys(username);
        password.sendKeys(pass);
        loginBtn.click();
        // register.click();

        driver.manage().window().minimize();
        driver.close();
    }
}
