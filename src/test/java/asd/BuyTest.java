package asd;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BuyTest {
    private FirefoxDriver driver;

    @Test
    public void testSum() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        ProductPage productPage = new ProductPage(driver);

        mainPage.open();
        mainPage.searchProduct("розетка");
        searchResultPage.clickFirstProduct();
        String expectedPrice = productPage.getPrice();

        productPage.clickBuy();

        //Get price from cart
        String priceInCart = driver.findElement(By.cssSelector("span[name='cost']")).getText();

        Assert.assertEquals(expectedPrice, priceInCart);
    }
}
