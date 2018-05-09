@test
Feature: As a amazon online shopping user I would wish to explore the website
  to understand it's functionality

  Scenario: Select books in the search and type in harry potter and check the first result option has harry potter in it
    Given I navigate to amazon website
   And I type in 'Harry Potter' in the search box
   And I press enter

  Scenario: Select books in the search and type in harry potter and check the first result option has harry potter in it
    Given I navigate to amazon website
    And I hover mouse over 'Shop By Department' to 'Food and Grocery' and click 'Grocery'
    Then I see 'Grocery' in the H2 on results page

