Feature: US_003 Login And Assertions

  Background: user login
    Given user goes to login page
    And user login with the username and password "standard_user" and "secret_sauce"

  @UI
  @smoke
  @login
  Scenario: User checks the numbers are increasing on the cart icon and add to cart button is changing to 'Remove'

    When user selects an item on the inventory page
    Then user is able to see the color of the button has changed
    And user is able to see the button text has changed to "Remove"
    And user able to see number is 1 on the cart icon

    When user selects a product on the inventory page
    And user able to see number is 2 on the cart icon

    When user selects a product on the inventory page
    And user able to see number is 3 on the cart icon