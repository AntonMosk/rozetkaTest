package asd;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By searchResult = By.className("g-i-list-title");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchResult() {
        driver.findElement(searchResult).click();
    }
}

