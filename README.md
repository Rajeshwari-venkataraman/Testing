# Testing
@READ ME 




1. Requirement Analysis
	-- Creating Selenium Web based Test suite using BDD ( Behaviour Driven Development) Test approach
	-- Eclipse IDE used . Have selected Cucumber BDD framwork.
	-- Junit and POM (Page Object Model) used for easy access of Library files.
	-- Xpath and OOPs ( Object Oriented Programms) used to identify the WebElements 

2. Scenarios
	-- Feature file created with Given Acceptance Criteria
Feature: Validate user able to add products into wish list , find lowest price item and
  add into my cart

  Scenario Outline: Add four products into wishlist
    Given User add four products into wishlist
    When user view mywhishlist
    Then Find price of each wishlist item
    When Search lower price product in Relevance
    And Able to add in to cart
    Then Verify myCart

	-- Just to showcase Tag used as SmokeTest

3. Procedure
	-- Junit package used to run the Feature files along with StepDefinitions /Glue code
	-- Target folder is been created with simple HTMLtestreport
	-- POM->Maven->cucumber dependencies are derived and lates snippets are copied from Maven Central Repository and Seleniumhq
	-- Basic Glue code is been initially copied ( to avoid duplicate of work) from console output while running feature file with Cucumber Editor.
  -- Proper user friendly comments been added in required places.

4. Outuput
	-- Console Println output strings are shown for better understanding.
	-- Html simple output have been created in Target folder for self reference.
	-- Screenshots docx been attached in Git repository.

5. Continous Improvements 
	-- Better Wait time handling for getting objects been loaded dynamically
	-- Dynamic input can be utilized with Example: and arguments in feature file
	-- Created tags can be utilized further to distingush the feature Vs Different Testing phases ( Smoke, ST,SIT ,Regression,etc...)
	-- Better pop up handling approach for Cookies.

Thanks for the oportunity and Excellent Experince gained!

