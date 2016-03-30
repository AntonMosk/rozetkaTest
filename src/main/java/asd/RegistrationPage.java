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
    public void enterWrongName (){
        driver.findElement(nameForm).click();
        driver.findElement(nameForm).sendKeys("!@#$%^&*");
    }
    public void enterName (){
        driver.findElement(nameForm).click();
        driver.findElement(nameForm).sendKeys("Аристотель");
    }
    public void enterWrongMail (){
        driver.findElement(emailForm).click();
        driver.findElement(emailForm).sendKeys("");
    }
    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
    public void enterPassword () {
        driver.findElement(passwordForm).click();
        driver.findElement(passwordForm).sendKeys("example12345");
    }
    public Boolean isEmailRed (){
        return  driver.findElement(By.name("email")).getCssValue("background-color").contains("rgba(255, 214, 214, 1)");
    }

}

