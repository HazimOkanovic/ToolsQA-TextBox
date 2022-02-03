package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TextBox {
    private WebDriver driver;
    private By userName = By.xpath("//*[@id=\"userName\"]");
    private By userEmail = By.xpath("//*[@id=\"userEmail\"]");
    private By currentAddress = By.xpath("//*[@id=\"currentAddress\"]");
    private By permanentAddress = By.xpath("//*[@id=\"permanentAddress\"]");
    private By submitButton = By.xpath("//*[@id=\"submit\"]");
    private By nameOutput = By.xpath("//div[@id = 'output']//div//p[@id = 'name']");
    private By emailOutput = By.xpath("//div[@id = 'output']//div//p[@id = 'email']");
    private By currentAddressOutput = By.xpath("//div[@id = 'output']//div//p[@id = 'currentAddress']");
    private By permanentAddressOutput = By.xpath("//div[@id = 'output']//div//p[@id = 'permanentAddress']");

    public TextBox(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserName(String name){
        driver.findElement(userName).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(userEmail).sendKeys(email);
    }
    public void enterCurrentAddress(String addressNow){
        driver.findElement(currentAddress).sendKeys(addressNow);
    }
    public void enterPermanentAddress(String addressAlways){
        driver.findElement(permanentAddress).sendKeys(addressAlways);
    }
    public void clickSubmit(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(submitButton);
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Actions actions = new Actions(driver);
        actions.click(Element).perform();
    }
    public String checkName(){
        return driver.findElement(nameOutput).getText();
    }
    public String checkEmail(){
        return driver.findElement(emailOutput).getText();
    }
    public String checkAddressNow(){
        return driver.findElement(currentAddressOutput).getText();
    }
    public String checkPermanentAddress(){
        return driver.findElement(permanentAddressOutput).getText();
    }
}
