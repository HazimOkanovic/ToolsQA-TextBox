package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Elements {
    private WebDriver driver;
    private By textButton = By.id("item-0");
    private By checkButton = By.id("item-1");

    public Elements(WebDriver driver){
        this.driver = driver;
    }
    public TextBox clickText() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(textButton);
        actions.click(element).perform();
        return new TextBox(driver);
    }
}
