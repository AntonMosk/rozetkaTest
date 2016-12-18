package asd;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    protected FirefoxDriver driver;
    protected MainPage mainPage;
    protected SearchResultPage searchResultPage;
    protected ProductPage productPage;
    protected Cart cart;
    protected RegistrationPage registrationPage;
    protected CabinetPage cabinetPage;


    @Before
    public void preCondition(){

    }
    @After
    public void postCondition(){
        driver.close();
    }
}
