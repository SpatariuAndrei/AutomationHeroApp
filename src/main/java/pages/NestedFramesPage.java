package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrameString = "frame-top";
   private String leftFrameString = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");


    public NestedFramesPage (WebDriver driver){
        this.driver = driver;

    }
    public void switchTopFrame (){
        driver.switchTo().frame(topFrameString);}

    public void switchLeftFrame (){
       driver.switchTo().frame(leftFrameString);


    }
    public void switchBottomFrame (){
        driver.switchTo().frame(bottomFrame);

    }
    private void switchToMainArea () {
        driver.switchTo().parentFrame();
    }

    public String getTextFromLeftFrame(){

        switchTopFrame();
        switchLeftFrame();
        String leftFrameText =  driver.findElement(body).getText();
        switchToMainArea();
        switchToMainArea();
        return leftFrameText;




    }
        public String getTextFromBottomFrame(){
            switchBottomFrame();
            String bottomFrameText =   driver.findElement(body).getText();
            switchToMainArea();
            return bottomFrameText;



        }

}

