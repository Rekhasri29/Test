Feature: Scenario Outline Feature

@tag2
Scenario Outline: Username and password values
Given: Write username with "<user>"
When: Write password with "<pass>"
Then: Verify the "<status>" in step

Examples: 
	|user  | pass     | status
	|Rekha |rekha@123 | success
	|Swathi|swathi@456| fail