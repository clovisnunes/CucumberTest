#Author: clobnjuh@gmail.com
#This is how background can be used to eliminate duplicate steps 

Feature: annotation

Background:
	User navigates to Faceboook
	Given I am on Facebook login page
	
#Scenario with BUT
Scenario: Login Fail
	When I enter username as "TOM"
	And I enter password as "JERRY"
	Then Login should fail
	But Relogin option should be available
	