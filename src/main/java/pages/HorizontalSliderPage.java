package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class HorizontalSliderPage {




    private WebDriver driver;
    private By clickSlider = By.cssSelector(".sliderContainer input");
    private By rangeText = By.id("range");
    private By sliderInput = By.cssSelector("input");
  //  private By minSlider = By.cssSelector("input[min]");
    //private By maxSlider = By.cssSelector("input[max]");
    //private By stepSlider = By.cssSelector("input[step]");


    public HorizontalSliderPage (WebDriver driver){
        this.driver = driver;


    }
    public void clickHorizontalSlider(){
        driver.findElement(clickSlider).sendKeys(Keys.ARROW_RIGHT);

    }
    public String getRangeText(){
       return driver.findElement(rangeText).getText();


    }
    public void setHorizontalValue (float sliderValue){
        float min = Float.parseFloat(driver.findElement(sliderInput).getAttribute("min"));
        float max =Float.parseFloat(driver.findElement(sliderInput).getAttribute("max"));
        float step = Float.parseFloat(driver.findElement(sliderInput).getAttribute("step"));



        for (float i = min ; i <=max ; i = i+step ){
            if(Float.parseFloat(getRangeText())< sliderValue){
                clickHorizontalSlider();

            }
            else break;

        }



    }
  }



