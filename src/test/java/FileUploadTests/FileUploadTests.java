package FileUploadTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("C:\\Users\\aspatariu\\cld_automation_community\\LoredanaC\\AutomationJavaTraining\\src\\main\\resources\\chromedriver.exe");
        Assert.assertEquals(fileUploadPage.getUploadedElement(), "chromedriver.exe" , "Element not correct");

    }


}
