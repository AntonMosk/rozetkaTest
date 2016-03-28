package asd;


import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.Cart;
import java.MainPage;
import java.ProductPage;
import java.SearchResultPage;
import java.util.concurrent.TimeUnit;

public class BuyTest {
    private FirefoxDriver driver;

    @Test
    public void testSum() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        ProductPage productPage = new ProductPage(driver);
        Cart cart = new Cart(driver);

        mainPage.open();
        mainPage.searchProduct("розетка");
        searchResultPage.clickFirstProduct();
        String expectedPrice = productPage.getPrice();

        productPage.clickBuy();
        String priceInCart = cart.getPriceInCart();

        Assert.assertEquals(expectedPrice, priceInCart);

        driver.close();
    }
    @Test
    public void testPrice() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        ProductPage productPage = new ProductPage(driver);
        Cart cart = new Cart(driver);

        mainPage.open();
        mainPage.searchProduct("3818036");
        searchResultPage.clickFirstProduct();
        productPage.clickBuy();

        String priceInCartOne = cart.getPriceInCart();
        int priceInCartOneINT = Integer.parseInt(priceInCartOne.replaceAll(" ", ""));
        int priceInCartTwoCheckINT = priceInCartOneINT *2;
        cart.changeQuantitiesPlus();
        Thread.sleep(10000);
        String priceInCartTwo = cart.getPriceInCart();
        int priceInCartTwoINT = Integer.parseInt(priceInCartTwo.replaceAll(" ", ""));
        Assert.assertEquals(priceInCartTwoCheckINT, priceInCartTwoINT);

        cart.changeQuantitiesSendOne();
        Thread.sleep(10000);
        String priceInCartThree = cart.getPriceInCart();
        int priceInCartThreeINT = Integer.parseInt(priceInCartThree.replaceAll(" ", ""));
        Assert.assertEquals(priceInCartOneINT, priceInCartThreeINT);
        driver.close();
        }
}
