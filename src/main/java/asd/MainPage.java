package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private By searchProductField = By.cssSelector("input[name=text]");
    private By enterButton = By.name("signin");
    private By registerButton = By.cssSelector(".auth-f-signup > a");
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
    public void goToRegistration(){
        driver.findElement(enterButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
        driver.findElement(registerButton).click();


    }
}
