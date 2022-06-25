Feature:  Test Orange HRM Login


  @login
  Scenario: Verify logo is present in Orange HRM homepage

    Given User launch chrome browser
    And I add some other file
    When I open Orange HRM homepage
    And I add few more stuff
    Then I verify that the logo is present on page
    And I validate my account page
    When I logout off the application.
    And User close browser
