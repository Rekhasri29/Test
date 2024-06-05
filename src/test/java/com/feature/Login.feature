Feature: LoginPage Scenarios

@tag1
Scenario: Validate the LoginPage with correct username and password
Given Launch the URL
When Enter the username "Rekha"
And Enter the password "Rekha@123"
And Click the Login button
Then Validate the Home page
