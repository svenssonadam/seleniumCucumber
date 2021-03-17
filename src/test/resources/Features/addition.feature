Feature: Calculator
In order to avoid silly mistakes as a math idiot i want to be told the sum of two numbers 
@mytag
//sad
Scenario: Add two numbers
Given I have entered 123 into the calculator
And I have also entered 456 into the calculator
When I press add
Then The result should be 579 on the screen
