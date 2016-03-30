package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.SystemClock;

import java.security.Key;
import java.util.Random;


public class RegistrationPage {
    public RegistrationPage (WebDriver driver) {
        this.driver = driver;
    }
    protected WebDriver driver;
    private By nameForm = By.name("title");
    private By emailForm = By.name("email");
    private By passwordForm = By.name("password");
    private By registerButton = By.cssSelector(".signup-submit button");
    public String generateEmail() {
        Random r = new Random(System.currentTimeMillis() );
        return "ari" + ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000)) + "@mailinator.com";
    }
    public void addRegistrationData() {
        driver.findElement(nameForm).click();
        driver.findElement(nameForm).sendKeys("Аристотель");
        driver.findElement(emailForm).sendKeys(generateEmail());
        driver.findElement(passwordForm).sendKeys("example9999");
        driver.findElement(registerButton).click();
    }
}
