package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
    private WebDriver driver;
    private By yesButton = By.id("yesRadio");
    private By impressiveButton = By.id("impressiveRadio");
    private By textField = By.xpath("//p[@class='mt-3']");
    private By noButton = By.xpath("//input[@id='noRadio']");
    
    public RadioButton (WebDriver driver){
        this.driver = driver;
    }
    public void clickYes(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(yesButton);
        actions.click(element).perform();
    }
    public void clickImpressive(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(impressiveButton);
        actions.click(element).perform();
    }
    public void clickNoButton(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(noButton);
        actions.click(element).perform();
    }
    public String checkResult(){
        return driver.findElement().getText(textField);
    }
}
