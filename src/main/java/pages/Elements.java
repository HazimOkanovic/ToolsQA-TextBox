package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButton {
    private WebDriver driver;
    private By yesButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/label");
    private By impressiveButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]");
    private By noButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[4]");
    private By textField = By.xpath("//p[@class='mt-3']");

    public RadioButton (WebDriver driver){
        this.driver = driver;
    }
    public void clickYes(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(yesButton)).click();
    }
    public void clickImpressive(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(impressiveButton)).click();
    }
    public void clickNoButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(noButton)).click();
    }
    public String checkResult(){
        return driver.findElement(textField).getText();
    }
}
