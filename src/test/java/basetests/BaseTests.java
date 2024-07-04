package basetests;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.ResultPage;


import java.io.File;
import java.io.IOException;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected ResultPage resultPage;


    //Set_Up the chromeDriver
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.flightnetwork.com/");
        homePage = new HomePage(driver);
        resultPage = new ResultPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void takeScreenshot() {
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("resources/screenshots/test_results.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
