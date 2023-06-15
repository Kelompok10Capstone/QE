Feature: Login User

  @Login-01
  Scenario: User mendapatkan data token dari fitur login
    Given I set login api endpoint for login feature
    When I send login HTTP request for login feature
    Then I received valid HTTP response code 200 for login
    Then I received valid data for login


