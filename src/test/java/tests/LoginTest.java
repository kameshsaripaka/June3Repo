package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

    @Test
    public void verifyTitle() {

    	ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/login");

        Assert.assertEquals(driver.getTitle(),
                "The Internet");

                
        driver.quit();
    }
}