package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {

    private WebDriver driver;
    private By priceLabel = By.id("price_label");
    private By buyButton = By.cssSelector(".detail-buy-btn-link>button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPrice() {
        return driver.findElement(priceLabel).getText();
    }

    public void clickBuy(){
        driver.findElement(buyButton).click();
    }

}
