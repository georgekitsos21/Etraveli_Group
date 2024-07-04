package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultPage {
    private WebDriver driver;
    private final By clickToFilter = By.xpath("//span[@class='css-gxg91e']");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    //Check the Proper Url Of the Result_Page
    public void checkUrlOfResultsPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.flightnetwork.com/rf/result"));
    }

    //Open the filter
    public void openFilter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickToFilter)).click();
    }

}
