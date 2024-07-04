package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    private final By returnOption = By.xpath("//label[@for='returnOption']//div[@class='_15h2k5o0 ioeri02 _15h2k5o1']");
    private final By fromInput = By.xpath("//div[contains(@class,'placeholder')][text()='From']");
    private final By toInput = By.xpath("//input[@id='searchForm-singleBound-destination-input']");
    private final By chooseAthensOption = By.xpath("//div[span[text()='Athens'] and span[text()=', Greece']]");
    private final By chooseThessalonikiOption = By.xpath("//div[span[text()='Thessaloniki'] and span[text()=', Greece']]");
    private final By clickToDeparture = By.xpath("//input[@id='singleBound.departureDate']");
    private final By clickToReturn = By.xpath("//input[@id='singleBound.returnDate']");
    private final By chooseDateFrom = By.xpath("//div[@class='css-qkh1e0' and text()='12']");
    private final By chooseDateTo = By.xpath("//div[@class='css-1h2zojm']//div[@class='css-qkh1e0' and text()='14']");
    private final By clickToPassenger = By.xpath("//button[@data-testid='searchForm-passengers-dropdown']");
    private final By clickToClass = By.xpath("//button[@data-testid='searchForm-cabinClasses-dropdown']");
    private final By clickSearchButton = By.xpath("//button[@type='submit']");



    //Create the Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Click to Return_type_option
    public void chooseReturnOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(returnOption)).click();
    }

    //Choose From Destination(i.e Athens)
    public void sendKeysToFromInput(String from) {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(fromInput));
        actions.click(driver.findElement(fromInput)).sendKeys(from).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseAthensOption)).click();
    }

    //Choose To Destination(i.e. Thessaloniki)
    public void sendKeysToInput(String to) {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toInput));
        actions.click(driver.findElement(toInput)).sendKeys(to).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseThessalonikiOption)).click();
    }

    //Choose particular Date for Departure(i.e. 12 Of July)
    public void dateFromDeparture() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        WebElement clickToDepartureCalendar = wait.until(ExpectedConditions.visibilityOfElementLocated(clickToDeparture));
        clickToDepartureCalendar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDateFrom)).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
    }

    //Choose particular Date for Return(i.e. 14 Of July)
    public void dateToReturn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickToReturnCalendar = wait.until(ExpectedConditions.visibilityOfElementLocated(clickToReturn));
        clickToReturnCalendar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseDateTo)).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
    }

    public void openToPassenger() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickToPassenger)).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
    }

    public void openToClass() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickToClass)).click();
    }

    //Click to search button in order to redirect to result_page
    public ResultPage clickSearchButton() {
        driver.findElement(clickSearchButton).click();
        return new ResultPage(driver);
    }
}
