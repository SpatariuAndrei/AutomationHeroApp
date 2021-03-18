package EntryAdPageTest;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EntryAdTest extends BaseTests {

    @Test
    public void modalWindowTest(){
        EntryAdPage entryAdPage = homePage.clickEntryAdLink();

        Assert.assertEquals(entryAdPage.getModalWindowText(), "THIS IS A MODAL WINDOW" , "Wrong modal window text");
        entryAdPage.clickModalWindow();
       Assert.assertEquals(entryAdPage.getEntryAdText(),"Entry Ad","Wrong page text");



    }




}
