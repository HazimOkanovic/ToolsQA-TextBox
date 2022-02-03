package radiobutton;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RadioButtonTest extends BaseTests {
    @Test
    public void yesButtonTest(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String selectedYes = "You have selected Yes";
      
        radioPage.clickYes();
        assertEquals(radioPage.checkResult(), selectedYes, "Yes is not working");     
    }
    @Test
    public void impressiveButtonTest(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String selectedImpressive = "You have selected Impressive";
        
        radioPage.clickImpressive();
        assertEquals(radioPage.checkResult(), selectedImpressive, "Impressive is not working");
    }   
     @Test
    public void noButtonTest(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String selectedNoButton = "You have selected No Button";
        
        radioPage.clickNoButton();
        assertEquals(radioPage.checkResult(), selectedNoButton, "No Button is not working");
    }   
}
