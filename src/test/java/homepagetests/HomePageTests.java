package homepagetests;

import basetests.BaseTests;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTests {

    @Test(alwaysRun = true, description = "Run the test in order to verify that the filters are working properly")
    public void fullFillFormDestination(){

        homePage.chooseReturnOption();
        homePage.sendKeysToFromInput("Athens");
        homePage.sendKeysToInput("Thessaloniki");
        homePage.dateFromDeparture();
        homePage.dateToReturn();
        homePage.openToPassenger();
        homePage.openToClass();
        homePage.clickSearchButton();
        resultPage.checkUrlOfResultsPage();
        resultPage.openFilter();
    }
}
