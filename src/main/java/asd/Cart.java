package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;


public class Cart {
    private WebDriver driver;
    private By priceInCart = By.cssSelector("span[name='cost']");

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public Integer getPriceInCart() {
        return Utils.formatPrice(driver.findElement(priceInCart).getText());
    }

    public void changeQuantitiesPlus() throws InterruptedException {
        String curPrice = getPriceInCart().toString();
        driver.findElement(By.className("cart-amount-plus")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(priceInCart, curPrice)));
        System.out.println(driver.findElement(By.name("quantity")).getText());
        Thread.sleep(1000);
    }

    public void changeQuantitiesSendOne() {
        String curPrice = getPriceInCart().toString();
        driver.findElement(By.name("quantity")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.name("quantity")).sendKeys("1");
        driver.findElement(By.name("quantity")).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElementLocated(priceInCart, curPrice)));
    }
}
