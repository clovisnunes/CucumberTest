# Author: clobnjuh@gmail.com
# Use of data table:  set of input to be provided for a single tag

Feature: New user registration
	Verify that the new user registration is unsuccessful after passing the incorrect inputs

Scenario: New user fail inputs
	Given I am on the new user registration page
	When I enter invalid data on the page

| Fields                 | Values              |
| First Name             | Tom                 |
| Last Name              | Kenny               |
| Email Address          | someone@someone.com |
| Re-enter Email Address | someone@someone.com |
| Password               | Password1           |
| Birthdate              | 01                  |

	Then User registration should be unsucessful	