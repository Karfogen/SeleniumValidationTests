package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LoginPage {
    private WebDriver driver;

    private By FirstnameField = By.id("firstName");
    private By LastNameField = By.id("lastName");
    private By EmailField = By.id("userEmail");
    private By Gendor = By.xpath("//label[text()='Male']");
    private By Mobile = By.id ("userNumber");
    private By DateOfBirth = By.id ("dateOfBirthInput");
    private By loginButton = By.id ("submit");

    // Конструктор
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    // Методы взаимодействия
    public void enterUsername(String username) {
        driver.findElement(FirstnameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LastNameField).sendKeys(password);
    }

    public void enterEmail (String email)
    {
        driver.findElement(EmailField).sendKeys(email);
    }

    public void SelectGendor()
    {
        driver.findElement(Gendor).click();
    }

    public void enterMobile (String mobile)
    {
        driver.findElement(Mobile).sendKeys(mobile);
    }

    public void enterDateOfBirht (String birth)
    {
        driver.findElement(DateOfBirth).sendKeys(birth);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    //позитивчик
    public void positiveCheck() {
        String textPozitive = driver.findElement(By.tagName("body")).getText();

        try {
            assertTrue(textPozitive.contains("Thanks for submitting the form"));
            System.out.println("✅ Проверка прошла успешно");
        } catch (AssertionError e) {
            System.out.println("❌ Ошибка проверки: сообщение не найдено!");
            throw e; // важно пробросить, чтобы тест всё равно упал!
        }
    }
    // негативчик
    public void negativeCheck() {
        String textPozitive = driver.findElement(By.tagName("body")).getText();

        try {
            assertFalse(textPozitive.contains("Thanks for submitting the form"));
            System.out.println("✅ Негативный тест пройден");
        } catch (AssertionError e) {
            System.out.println("❌ Ошибка теста!");
            throw e; // важно пробросить, чтобы тест всё равно упал!
        }
    }
}

