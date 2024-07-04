package homepagetests;

import basetests.BaseTests;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTests {

    @Test
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
