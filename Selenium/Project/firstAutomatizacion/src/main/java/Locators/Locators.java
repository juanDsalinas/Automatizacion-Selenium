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

        driver.get("https://es-la.facebook.com/");

        driver.manage().window().maximize();

        String username = "standard_user";
        String pass="secret_sauce";

        // ID
        //WebElement usernameI = driver.findElement(By.id("user-name"));
        // WebElement password = driver.findElement(By.id("password"));
        //WebElement loginBtn = driver.findElement(By.id("login-button"));
        // WebElement register = driver.findElement(By.className(".product_sort_container"));
        // WebElement cake = driver.findElement();
        driver.findElement(By.id("email")).sendKeys("Panadero");
        driver.findElement(By.id("pass")).sendKeys("con el pa");

        //WebElement loginBtn = driver.findElement(By.id(""))

        // ClassName
        // WebElement loginBtn = driver.findElement(By.className("btn_action"));
        WebElement loginBtn = driver.findElement(By.className("login"));
        // Name
        // WebElement password = driver.findElement(By.name("password"));

        // xpath
        //WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        // css Selector
        // WebElement password = driver.findElement(By.cssSelector("input#password"));

        // usernameI.sendKeys(username);
        // password.sendKeys(pass);
        loginBtn.submit();
        // register.click();
        // System.out.println(driver.getTitle());
        // System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());
        // driver.navigate().to("https://www.youtube.com/");
        // driver.navigate().back();
        // driver.manage().window().minimize();
        // cierra la ventana actual
        // driver.close();

        // finaliza todas las instancias del driver
        // driver.quit();
    }
}
