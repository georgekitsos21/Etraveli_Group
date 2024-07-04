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

3. Configure WebDriver, System.setProperty("webdriver.chrome.driver", "resources/chromedriver"); or "resources/chromedriver.exe if you have a windows machine

4. Download the WebDriver executable for your browser and add it to your system's PATH. Alternatively, specify its location in the BaseTests class
    

## Test Details

# Test Conditions, Test Cases, and Expected Results
# Test Conditions
  
  -	User must navigate to the results page with search criteria.
  -	Filters must be displayed and functional.

#Test Cases:

- Verify the Number of Stops Filter
    - Condition: Apply a From Destination (for example Athens)
    	- Expected Result: Athens, Greece should be selected.
    - Condition: Apply a From Destination (for example Thessaloniki)
    	- Expected Result: Thessaloniki, Greece should be selected.
  - Condition: Apply to a Departure Date(for example 12 of July)
  	- Expected Result: 12 Of July should be selected.
  -	Condition: Apply to a Retrun Date (for example 14 of July)
  	- Expected Result: 14 Of July should be selected.
  -	Condition: Apply a filter to choose how many passengers (for example 1 adult)
  	- Expected Result: One passenger should be selected.
  -	Condition : Apply for a class(for example econonomy) 
	 - Expected Result: Economy class should be selected.
  -     Condition: Click to search button in order to see the available flight
    	 - Expected Result: User should be redirected to the result page.
  -     Condition: Click to filterby icon
    	 - Expected Result: All the filters related to the available flights should be available.

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
