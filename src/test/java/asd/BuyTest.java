package asd;


import org.junit.Assert;
import org.junit.Test;

public class BuyTest extends AbstractTest{

    @Test
    public void testSum() throws InterruptedException {
        mainPage.open();
        mainPage.searchProduct("розетка");
        searchResultPage.clickFirstProduct();
        int expectedPrice = productPage.getPrice();

        productPage.clickBuy();
        int priceInCart = cart.getPriceInCart();

        Assert.assertEquals(expectedPrice, priceInCart);
    }

    @Test
    public void testPrice() throws InterruptedException {
        mainPage.open();
        mainPage.searchProduct("3818036");
        searchResultPage.clickFirstProduct();
        productPage.clickBuy();

        int priceInCartOne = cart.getPriceInCart();
        int priceInCartTwoCheck = priceInCartOne * 2;
        cart.changeQuantitiesPlus();
        int priceInCartTwo = cart.getPriceInCart();
        Assert.assertEquals(priceInCartTwoCheck, priceInCartTwo);

        cart.changeQuantitiesSendOne();
        int priceInCartThree = cart.getPriceInCart();
        Assert.assertEquals(priceInCartOne, priceInCartThree);
    }
}
