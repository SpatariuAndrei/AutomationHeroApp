package horizontalSlider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class horizontalSliderTest extends BaseTests {

    @Test
    public void sliderTest(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderLink();
        horizontalSliderPage.setHorizontalValue(2);
        Assert.assertEquals(horizontalSliderPage.getRangeText(),"2" ,"WrongValue");

//        horizontalSliderPage.setHorizontalValue(3);
  //      Assert.assertEquals(horizontalSliderPage.getRangeText(),"3" ,"WrongValue");
    }


}
