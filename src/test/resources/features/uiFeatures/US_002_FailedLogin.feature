#Facebook, LinkedIn, Twitter, Instagram icons should be visible
#Facebook, LinkedIn, Twitter, Instagram icons should be clickable
#After clicking the Facebook, LinkedIn, Twitter, Instagram icons, the company-related pages should be visible.

Feature: US_002 Failed Login


  Scenario: User going to the main page by using the page url
    Given user goes to login page


 Scenario: Trying to login with incorrect credentials
    Given user enters the username and password "premium_user" and "secret_password"

  Scenario: Ensure that user is not able to login with incorrect credentials
    Given assertion for unsuccesful login