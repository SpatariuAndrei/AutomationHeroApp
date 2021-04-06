package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();

    }

    public LoginPage clickFormAuthentificationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);


    }

    public DropdownPage clickDropDownLink() {
        clickLink("Dropdown");
        return new DropdownPage(driver);


    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);


    }

    public HooverPage clickHooverLink() {
        clickLink("Hovers");
        return new HooverPage(driver);


    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);


    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);


    }

    public AlertsPage clickOnJavaScriptAlert() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);

    }

    public FileUploadPage clickFileUploadLink() {
        clickLink("File Upload");
        return new FileUploadPage(driver);

    }

    public EntryAdPage clickEntryAdLink() {
        clickLink("Entry Ad");

        return new EntryAdPage(driver);

    }

    public ContextMenuPage clickContextmenuLink() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WysiwygeEditorPage clickWYSIWYGEditorLink () {
        clickLink("WYSIWYG Editor");
        return new WysiwygeEditorPage(driver);




    }
    public FramesPage clickFramesLink (){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingLink (){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);


    }
}