Feature: Get PDAM By Id

  @Get-PDAM-by-Id-01
  Scenario: User berhasil mendapat data PDAM dari id
    Given User have endpoint auth login for get PDAM by ID
    When User send endpoint auth for get PDAM by ID feature and get token
    Then User set get PDAM by ID api endpoint
    Then User send HTTP request for get PDAM by ID
    And User received valid HTTP response code 200 for get PDAM by ID
    And User received valid data message success : Successfully get PDAM