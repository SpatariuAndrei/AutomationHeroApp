package ContextMenuPage;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTests {

    @Test
    public void contextBoxTest(){
        ContextMenuPage contextMenuPage = homePage.clickContextmenuLink();
        contextMenuPage.clickContextBox();
        Assert.assertEquals(contextMenuPage.getPopUpText() ,"You selected a context menu","Not the expected text");
        contextMenuPage.acceptPopUp();


    }





}
