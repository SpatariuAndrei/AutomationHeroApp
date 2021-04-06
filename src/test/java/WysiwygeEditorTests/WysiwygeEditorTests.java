package WysiwygeEditorTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygeEditorPage;

public class WysiwygeEditorTests extends BaseTests {


    @Test
    public void insertTextInFrame(){

        String text1 = "Hello ";
        String text2 = "World";
       WysiwygeEditorPage wysiwygeEditorPage = homePage.clickWYSIWYGEditorLink();
        wysiwygeEditorPage.clearTextFrame();
        wysiwygeEditorPage.setTextFrame(text1);
        wysiwygeEditorPage.clickIndentButton();
        wysiwygeEditorPage.setTextFrame(text2);
        Assert.assertEquals(wysiwygeEditorPage.getTextFromFrame(),text1+text2, "Not the correct text");




    }
}
