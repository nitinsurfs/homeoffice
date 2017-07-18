Feature: Vehicle details

  @complete
  Scenario Outline: Verify vehicle details
    Given I load the data from row "<row>" of vehicle registration details file
    And I navigate to dvla page
    When I start the process to get the vehicle info from DVLA
    And find the registration number of the vehicle
    Then DVLA should return the correct vehicle details
Examples:
  |row|
    |0  |
    |1  |





