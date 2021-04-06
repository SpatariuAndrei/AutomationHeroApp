package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygeEditorPage {

    private WebDriver driver;
    private String editorFrameId = "mce_0_ifr";
    private By testAreaFrame = By.id("tinymce");
    private By indentButton = By.cssSelector("[aria-label= 'Increase indent']");


    public WysiwygeEditorPage(WebDriver driver) {

        this.driver = driver;

    }

    public void clearTextFrame() {
        switchToEditArea();
        driver.findElement(testAreaFrame).clear();
        switchToMainArea();


    }

    public void setTextFrame(String text) {
        switchToEditArea();
        driver.findElement(testAreaFrame).sendKeys(text);
        switchToMainArea();

    }
        private void switchToEditArea () {
            driver.switchTo().frame(editorFrameId);


        }


        private void switchToMainArea () {
            driver.switchTo().parentFrame();

        }
        public void clickIndentButton (){
        driver.findElement(indentButton).click();

    }
    public String getTextFromFrame (){
            switchToEditArea();
          String frameText = driver.findElement(testAreaFrame).getText();
          switchToMainArea();
          return frameText;



    }

}