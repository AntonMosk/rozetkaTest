package asd;


import org.junit.Assert;
import org.junit.Test;

public class BuyTest extends AbstractTest{

    @Test
    public void testSum() throws InterruptedException {
        mainPage.open();
        mainPage.searchProduct("розетка");
        searchResultPage.clickFirstProduct();
        String expectedPrice = productPage.getPrice();

        productPage.clickBuy();
        String priceInCart = cart.getPriceInCart();

        Assert.assertEquals(expectedPrice, priceInCart);
    }

    @Test
    public void testPrice() throws InterruptedException {
        mainPage.open();
        mainPage.searchProduct("3818036");
        searchResultPage.clickFirstProduct();
        productPage.clickBuy();

        String priceInCartOne = cart.getPriceInCart();
        int priceInCartOneINT = Integer.parseInt(priceInCartOne.replaceAll(" ", ""));
        int priceInCartTwoCheckINT = priceInCartOneINT * 2;
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
    }
}
