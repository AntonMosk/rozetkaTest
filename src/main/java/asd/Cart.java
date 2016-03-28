package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;


public class Cart {
    private WebDriver driver;
    private By priceInCart = By.cssSelector("span[name='cost']");

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public String getPriceInCart() {return driver.findElement(priceInCart).getText();}
    public void changeQuantitiesPlus() {
        driver.findElement(By.className("cart-amount-plus")).click();}
    public void changeQuantitiesSendOne() {
        driver.findElement(By.name("quantity")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.name("quantity")).sendKeys("1");
        driver.findElement(By.name("quantity")).sendKeys(Keys.ENTER);
    }
}
