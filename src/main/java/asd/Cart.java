package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Cart {

    private WebDriver driver;
    private By priceInCart = By.cssSelector("span[name='cost']");

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public String getPriceInCart() {return driver.findElement(priceInCart).getText();}
}
