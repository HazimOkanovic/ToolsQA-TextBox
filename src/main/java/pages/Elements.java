package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Elements {
    private WebDriver driver;
    private By textButton = By.id("item-0");
    private By radioButton = By.id("item-2");
    private By buttonsPage = By.id("item-4");

    public Elements(WebDriver driver){
        this.driver = driver;
    }
    public TextBox clickText() {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        WebElement element = driver.findElement(textButton);
        actions.click(element).perform();
        return new TextBox(driver);
    }
    public RadioButton clickRadioButton(){
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(radioButton));
        element.click();
        return new RadioButton(driver);
    }
    public ButtonsPage clickButtons(){
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(buttonsPage));
        element.click();
        return new ButtonsPage(driver);
    }
}
