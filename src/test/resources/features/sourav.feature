Feature:  Test Orange HRM Login


  @login
  Scenario: Verify logo is present in Orange HRM homepage

    Given User launch chrome browser
    When I open Orange HRM homepage
    And I login to the application
    Then I verify that the logo is present on page
    When I logout off the application.
    And User close browser