package asd;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationTest extends AbstractTest {
    @Test
    public void registrationTest() throws InterruptedException {
        mainPage.open();
    }
    @Test
    public void registrationWithWrongMail() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPage.enterName();
        registrationPage.enterWrongMail();
        registrationPage.clickRegisterButton();
        Thread.sleep(5000);
        Assert.assertTrue(registrationPage.isEmailRed());
    }
}
