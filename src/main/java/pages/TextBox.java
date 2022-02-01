package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TextBox {
    private WebDriver driver;

    public TextBox(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserName(String name){
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(email);
    }
    public void enterCurrentAddress(String currentAddress){
        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys(currentAddress);
    }
    public void enterPermanentAddress(String permanentAddress){
        driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys(permanentAddress);
    }
    public void clickSubmit(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Actions actions = new Actions(driver);
        actions.click(Element).perform();
    }
    public String checkName(){
        return driver.findElement(By.xpath("//div[@id = 'output']//div//p[@id = 'name']")).getText();
    }
    public String checkEmail(){
        return driver.findElement(By.xpath("//div[@id = 'output']//div//p[@id = 'email']")).getText();
    }
    public String checkAddressNow(){
        return driver.findElement(By.xpath("//div[@id = 'output']//div//p[@id = 'currentAddress']")).getText();
    }
    public String checkPermanentAddress(){
        return driver.findElement(By.xpath("//div[@id = 'output']//div//p[@id = 'permanentAddress']")).getText();
    }
}
