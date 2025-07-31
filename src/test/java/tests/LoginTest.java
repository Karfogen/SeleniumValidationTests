package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import page.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Позитивный тест валидация")
    public void testValidLogin() {
        driver.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%'");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Максим");
        loginPage.enterPassword("Naumov");
        loginPage.enterEmail("naumovm41@mail.ru");
        loginPage.SelectGendor();
        loginPage.enterMobile("8912710909");
        loginPage.enterDateOfBirht("01.01.2001");
        loginPage.clickLogin();
        loginPage.positiveCheck();

    }

    @Test
    @DisplayName("Негативный тест валидация")
    public void NegativeValidLogin() {
        driver.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='80%'");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Максим");
        loginPage.enterPassword("Naumov");
        loginPage.enterEmail("NeprevilnuyEmail"); //неверный логин
        loginPage.SelectGendor();
        loginPage.enterMobile("8912710909");
        loginPage.enterDateOfBirht("01.01.2001");
        loginPage.clickLogin();
        loginPage.negativeCheck();

    }
}
