package asd;


import org.junit.Assert;
import org.junit.Test;

public class BuyTest extends AbstractTest{

    @Test
    public void testSum() throws InterruptedException {
        //Given

        mainPage.searchProduct("розетка");
        searchResultPage.clickFirstProduct();
//        GIven
        int expectedPrice = productPage.getPrice();

//        When
        productPage.clickBuy();
        int priceInCart = cart.getPriceInCart();
//Then
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
