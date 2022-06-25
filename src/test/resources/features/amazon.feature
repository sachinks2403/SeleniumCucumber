Feature:  Test Login functionality

  @login
  Scenario: Successful login with valid credentials

    Given User launch chrome browser
    When User opens url "http://amazon.com"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on "Login"
    Then Page title should be "Amazon"