Feature: US_001 Login And Purchase
   @UI
    @smoke
    @login
    Scenario: is user able to go to the homepage
      Given user goes to login page
     Given user enters the username and password "standard_user" and "secret_sauce"
     Given user clicks login button
      Given user selects an item on the page
      And user clicks on the basket icon to go to the basket
    Given user checks out
    Given user enters the firstname , lastname and postalcode "burak" , "aslim" and "123456"

  @smoke
  @login
  Scenario: is user able click continue button
    Given user clicks continue button

  @smoke
  @login
  Scenario: is user able click finish button and complete the purchase
    Given user clicks finish button

  @smoke
  @login
  Scenario: ensure that user completed the purchase
    Given assertion for successful purchase

