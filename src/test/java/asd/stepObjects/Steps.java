package asd.stepObjects;

import asd.*;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Steps {
    protected FirefoxDriver driver;
    protected MainPage mainPage;
    protected SearchResultPage searchResultPage;
    protected ProductPage productPage;
    protected Cart cart;
    protected RegistrationPage registrationPage;
    protected CabinetPage cabinetPage;

    @BeforeScenario
    public void precondition(){
        File geckdriver  = new File(this.getClass().getClassLoader().getResource("geckodriver").getFile());
        System.setProperty("webdriver.gecko.driver",geckdriver.getAbsolutePath());
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        productPage = new ProductPage(driver);
        cart = new Cart(driver);
        registrationPage = new RegistrationPage(driver);
        cabinetPage = new CabinetPage(driver);
    }

    @Given("a user is on the main page")
    public void givenAUserIsOnTheMainPage(){
        mainPage.open();
    }


}
