Feature: Shopping on a website
As a person 
I want to browse items on a website
So that I can purchase the Items I want

Scenario: Browse the items available on the website
	Given the correct web address
	When I navigate to the 'Menu' page
	Then I can browse a list of available items
	
Scenario: Add an item to checkout
	Given the correct web address
	When I click the checkout button
	Then I am taken to the checkout page