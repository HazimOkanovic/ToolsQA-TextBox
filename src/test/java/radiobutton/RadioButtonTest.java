package radiobutton;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RadioButtonTest extends BaseTests {
    @Test
    public void radioYesButton(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String yesResult = "You have selected Yes";
        radioPage.clickYes();
        assertEquals(radioPage.checkResult(), yesResult, "Yes is not working");
    }
    @Test
    public void radioImpressiveButton(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String impressiveResult = "You have selected Impressive";
        radioPage.clickImpressive();
        assertEquals(radioPage.checkResult(), impressiveResult, "Impressive is not working");
    }
    @Test
    public void radioNoButtonTest(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String noButtonResult = "You have selected No";
        radioPage.clickNoButton();
        assertEquals(radioPage.checkResult(), noButtonResult, "No Button is not working");
    }
}
