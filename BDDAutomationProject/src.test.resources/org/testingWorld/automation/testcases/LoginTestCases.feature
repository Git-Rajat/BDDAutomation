Feature: Facebook Login Functionality
 Scenario: Login with valid Credentials
 Given User is on Login Page
 When  User enters username
 And   User enters password
 And   User clicks on SignIn Button
 Then User logged in Successfully
 
  Scenario: Login with Invalid Credentials
 Given User is on Login Page
 When  User enters Incorrect username
 And   User enters password
 And   User clicks on SignIn Button
 Then User should not be logged in.