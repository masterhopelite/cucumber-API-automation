Feature: API Testing using RestAssured

  Scenario: Validate GET request
    Given I set up the API request
    When I send a GET request to "/users/2"
    Then The response status code should be 200
