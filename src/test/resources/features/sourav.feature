Feature:  Test Orange HRM Login


  @login
  Scenario: Verify logo is present in Orange HRM homepage

    Given User launch chrome browser
    When I open Orange HRM homepage
    Then I verify that the logo is present on page
    And I validate my account page
    When I logout off the application.
    And User close browser