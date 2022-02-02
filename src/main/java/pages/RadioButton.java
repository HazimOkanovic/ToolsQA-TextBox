package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
    private WebDriver driver;
    public RadioButton (WebDriver driver){
        this.driver = driver;
    }
    public void clickYes(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("yesRadio"));
        actions.click(element).perform();
    }
    public void clickImpressive(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("impressiveRadio"));
        actions.click(element).perform();
    }
    public String checkResult(){
        return driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
    }
}
