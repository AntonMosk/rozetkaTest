package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By searchResult = By.cssSelector(".g-i-tile-i-box-desc a>img");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstProduct() {
        driver.findElement(searchResult).click();
    }
}

