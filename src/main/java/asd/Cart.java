package asd;

import org.eclipse.jetty.util.ByteArrayOutputStream2;
import org.jboss.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
        driver.findElement(By.className("cart-amount-plus")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#cart_payment_info img")));
    }

    public void changeQuantitiesSendOne() {
        driver.findElement(By.name("quantity")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.name("quantity")).sendKeys("1");
        driver.findElement(By.name("quantity")).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#cart_payment_info img")));
    }
}