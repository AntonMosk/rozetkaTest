package asd;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        productPage = new ProductPage(driver);
        cart = new Cart(driver);
        registrationPage = new RegistrationPage(driver);
        cabinetPage = new CabinetPage(driver);
    }
    @After
    public void postCondition(){
        driver.close();
    }
}
