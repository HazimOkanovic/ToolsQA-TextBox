package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By elements = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public Elements clickElements(){
        WebElement webElement = driver.findElement(elements);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
        return new Elements(driver);
    }
}
