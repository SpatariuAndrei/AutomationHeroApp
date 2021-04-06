package DynamicLoadingTest;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTests {

    @Test
    public void dynamicExample1Test(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.clickExample1();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getLoadingText(),"Hello World!", "Wrong Text found");


    }


}
