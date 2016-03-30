package asd;

import org.junit.Test;
import org.openqa.selenium.By;

public class RegistrationTest extends AbstractTest {
    private By inputField = By.className("form-control");
    @Test
    public void registrationTest() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPage.addRegistrationData();
        cabitetPage.clickConfirmMail();


    }


}
