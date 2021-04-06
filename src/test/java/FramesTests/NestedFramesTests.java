package FramesTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

public class NestedFramesTests extends BaseTests {

    @Test
    public void checkTextFromFrames(){
        FramesPage framesPage = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();

        Assert.assertEquals(nestedFramesPage.getTextFromLeftFrame(),"LEFT", "You are Not in the Left Frame");
        Assert.assertEquals(nestedFramesPage.getTextFromBottomFrame(),"BOTTOM","You are Not in the Bottom Frame" );

    }


}
