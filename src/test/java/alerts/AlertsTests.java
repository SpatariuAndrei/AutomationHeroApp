package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class  AlertsTests extends BaseTests {

   @Test
    public void getJSAlert(){

    AlertsPage alertsPage = homePage.clickOnJavaScriptAlert();
    alertsPage.clickJSAllert();
    alertsPage.acceptAlert();
    Assert.assertEquals(alertsPage.getAlertResult(), "You successfully clicked an alert","Result text incorrect" );


    }

    @Test
    public void getJSConfirm(){
       AlertsPage alertsPage = homePage.clickOnJavaScriptAlert();
       alertsPage.clickJSConfirm();

       Assert.assertEquals(alertsPage.getJSConfirmAlertText(),"I am a JS Confirm","Incorrect text ");
        alertsPage.clickCancelOnJSConfirm();
        Assert.assertEquals(alertsPage.getAlertResult(), "You clicked: Cancel", "Incorrect text");

    }
    @Test
    public void getJSPrompt(){
       AlertsPage alertsPage = homePage.clickOnJavaScriptAlert();
       alertsPage.clickJSPrompt();
       Assert.assertEquals(alertsPage.getJSPrompAlertText(), "I am a JS prompt","Incorrect text");
       String jsPromptText = "ANDREI";
       alertsPage.insertTextOnJSPrompt(jsPromptText);
       alertsPage.acceptAlert();
       Assert.assertEquals(alertsPage.getAlertResult(),"You entered: " + jsPromptText , "Incorrect text" );

    }

}
