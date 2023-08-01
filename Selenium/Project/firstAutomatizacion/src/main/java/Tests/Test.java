package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\Project\\firstAutomatizacion\\src\\main\\resources\\driver\\chromedriver-win64\\chromedriver.exe");

        // inicializamos e instanciamos el browser
        WebDriver driver = new ChromeDriver();

        // redirige a una url
        driver.get("https://www.youtube.com/");

        // agranda la pantalla
        driver.manage().window().maximize();

        // cierra automaticamente el driver
        driver.close();

    }
}
