Flight Network Automation Testing with Selenium
This project contains an automation suite for testing the Flight Network website using Selenium WebDriver and TestNG. The suite includes scripts to perform actions such as selecting return options, inputting destinations, choosing travel dates, selecting passengers and travel class, and verifying the results page URL.

Table of Contents
Project Structure
Setup
Usage
Test Cases
Web Elements and Actions
Result Page Verification
Screenshots
Additional Notes
Project Structure
The project is organized into the following packages and classes:

pages
HomePage: Contains methods to interact with elements on the home page.
ResultPage: Contains methods to interact with elements on the results page and verify the page URL.
basetests
BaseTests: Sets up and tears down the WebDriver, and takes screenshots after each test.
homepagetests
HomePageTests: Contains the test method for filling out the form and performing the search.
Setup
Prerequisites
JDK (Java Development Kit) installed.
Maven installed.
Chrome browser installed.
ChromeDriver executable available in resources folder.
Steps
Clone the repository:
sh
Copy code
git clone https://github.com/your-repo/flight-network-automation.git
Navigate to the project directory:
sh
Copy code
cd flight-network-automation
Install the dependencies:
sh
Copy code
mvn clean install
Usage
Running Tests
To execute the tests, use the following Maven command:

sh
Copy code
mvn test
Test Cases
The primary test case included is fullFillFormDestination which performs the following steps:

Choose the return trip option.
Input 'Athens' as the origin.
Input 'Thessaloniki' as the destination.
Select the departure date.
Select the return date.
Open the passenger selection dropdown.
Open the travel class selection dropdown.
Click the search button.
Verify the URL of the results page.
Open the filter section on the results page.
