Feature:  Test Login functionality

  @login
  Scenario: Successful login with valid credentials

    Given User launch chrome browser
    When User opens url "http://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And User clicks on "Login"
    Then Page title should be "Dashboard / nopCommerce administration"
    And User close browser

  @propReader
  Scenario: Successful login with valid credentials

    Given User launch chrome browser
    When User opens url
    And User enters email and password
    And User clicks on "Login"
    Then Page title should be "Dashboard / nopCommerce administration"
    And User close browser