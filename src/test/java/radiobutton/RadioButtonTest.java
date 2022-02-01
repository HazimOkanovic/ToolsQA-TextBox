package radiobutton;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RadioButtonTest extends BaseTests {
    @Test
    public void radioButtonTest(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();

        radioPage.clickYes();
        assertEquals(radioPage.checkResult(), "You have selected Yes", "Yes is not working");
        radioPage.clickImpressive();
        assertEquals(radioPage.checkResult(), "You have selected Impressive", "Impressive is not working");
    }
}
