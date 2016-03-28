package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    private By searchProductField = By.cssSelector("div[name='header-search-input-text-wrap']>input");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("http://www.rozetka.com.ua");
    }

    public void searchProduct(String productName){
        driver.findElement(searchProductField).click();
        driver.findElement(searchProductField).sendKeys(productName);
        driver.findElement(searchProductField).sendKeys(Keys.ENTER);
    }
}
