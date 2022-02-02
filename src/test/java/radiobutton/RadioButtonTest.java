package radiobutton;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class RadioButtonTest extends BaseTests {
    @Test
    public void radioButtonTest(){
        var elementsPage = homePage.clickElements();
        var radioPage = elementsPage.clickRadioButton();
        String selectedYes = "You have selected Yes";
        String selectedImpressive = "You have selected Impressive";

        radioPage.clickYes();
        assertEquals(radioPage.checkResult(), selectedYes, "Yes is not working");
        radioPage.clickImpressive();
        assertEquals(radioPage.checkResult(), selectedImpressive, "Impressive is not working");
    }
}
