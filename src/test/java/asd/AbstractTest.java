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

    @Before
    public void preCondition(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        productPage = new ProductPage(driver);
        cart = new Cart(driver);
    }

    @After
    public void postCondition(){
        driver.close();
    }
}
