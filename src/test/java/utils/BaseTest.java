package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().minimize();


    }
    @AfterEach
    void shotdown()
    {
        driver.quit();
    }


}
