# Flight Network Filter Validation with Selenium

## Objective


The objective is to create test cases and build a test automation suite to validate that the filters on the flight results page work properly.


## Application Overview
The web application allows users to book flight tickets. Users must provide necessary details (such as destination and dates) to view available flights matching their criteria. One such application is located at Flight Network.
On the start page, users must complete all required fields:
-	From (origin)
-	To (destination)
-	Departure and Return dates
-	Number of passengers
-	Choose the desiring class


## Setup Instructions

1. Clone the Repository, git clone <https://github.com/georgekitsos21/etraveli_Group.git>

2. Mvn clean install and install maven dependencies, then reload the project.

3. Configure WebDriver, System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

4. Download the WebDriver executable for your browser and add it to your system's PATH. Alternatively, specify its location in the BaseTests class
    

## Test Details

# Test Conditions, Test Cases, and Expected Results
# Test Conditions
  
  -	User must navigate to the results page with search criteria.
  -	Filters must be displayed and functional.

#Test Cases:

- Verify the Number of Stops Filter
    - Condition: Apply a filter for non-stop flights.
    - Expected Result: Only non-stop flights are displayed.
-	Verify the Price Filter
    - Condition: Apply a filter for a specific price range.
    - Expected Result: Only flights within the specified price range are displayed.
-	Verify the Airlines Filter
  -	Condition: Apply a filter for a specific airline.
  -	Expected Result: Only flights from the selected airline are displayed.
-	Verify the Departure/Arrival Time Filter
  -	Condition: Apply a filter for a specific departure time range.
  - Expected Result: Only flights departing within the specified time range are displayed.
-	Verify the Travel Time Filter
	 - Condition: Apply a filter for a specific travel duration.
   - Expected Result: Only flights within the specified travel time are displayed.

# Automated Test Scenarios

- The automated tests are implemented using Selenium WebDriver and TestNG.
- Project Structure
The project is organized into the following packages and classes:

# Pages
-	HomePage: Interacts with the home page elements.
-	ResultPage: Interacts with the results page elements and verifies the page URL.

# Tests
- basetests
	- BaseTests: Sets up and tears down the WebDriver, and takes screenshots after each test.


## Troubleshooting

- Ensure WebDriver is in your PATH or correctly specified.
- Confirm the website (https://demoqa.com/books) is accessible.
- Check Maven dependencies with `mvn clean install`.
