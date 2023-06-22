Feature: Get Internet By Id

  @Get-internet-by-Id-01
  Scenario: User berhasil mendapat data wifi dari id
    Given User have endpoint auth login for get internet by ID
    When User send endpoint auth for get internet by ID feature and get token
    Then User set get internet by ID api endpoint
    Then User send HTTP request for get internet by ID
    And User received valid HTTP response code 200 for get internet by ID
    And User received message success : Successfully get WiFi