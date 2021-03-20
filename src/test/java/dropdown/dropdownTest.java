package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class dropdownTest extends BaseTests {
    @Test
     public void selectDromDropdownTest(){
         DropdownPage dropdownPage = homePage.clickDropDownLink();
         String option= "Option 1";
             dropdownPage.clickFromDropDownList(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"Option not selected");
     }
    @Test
    public void selectOption2dropdownTest(){
        DropdownPage dropdownpage = homePage.clickDropDownLink();
        String option2 = "Option 2";
        dropdownpage.clickFromDropDownList(option2);
        List<String> selectOption2 = dropdownpage.getSelectedOptions();
        Assert.assertEquals(selectOption2.size(),1,"Not the right size");
        Assert.assertTrue(selectOption2.contains(option2),"Option not selected");





    }

}
