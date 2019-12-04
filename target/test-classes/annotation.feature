# Author: clobnjuh@gmail.com
# This is how background can be used to eliminate duplicate steps 
# Scenario outline replaces variable/keywords with the value from the table
# Tags 

Feature: annotation

Background:
	User navigates to Faceboook
	Given I am on Facebook login page
	
#Scenario with BUT and Outline
Scenario Outline: Login Fail
	When I enter username as "<username>"
	And I enter password as "<password>"
	Then Login should fail
	But Relogin option should be available
	
Examples:
	| username  | password |
	| TOM | JERRY |
	| PATATI | PATATA |
	| LIGEI | RINHO |
	
#following scenario has been tagged as ReadyForTest and this should get executed
@ReadyForTest
Scenario: Forgot Password
	When I click on Forgot Account option
	Then I go to Find your account page
	