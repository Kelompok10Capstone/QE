Feature: Get Internet By Id

  @Get-internet-by-Id-01
  Scenario: User berhasil mendapat data wifi dari id
    Given User have endpoint auth login for get internet by ID
    When User send endpoint auth for get internet by ID feature and get token
    Then User set get internet by ID api endpoint
    Then User send HTTP request for get internet by ID
    And User received valid HTTP response code 200 for get internet by ID
    And User received message success : Successfully get WiFi

  @Get-internet-by-Id-02
  Scenario: User belum berhasil mendapat data wifi dari id karena menggunakan id yang salah
    Given User have endpoint auth login for get internet by ID
    When User send endpoint auth for get internet by ID feature and get token
    Then User set get internet by ID api invalid endpoint
    Then User send HTTP request for get internet by ID with invalid id
    And User received invalid HTTP response code 404 for get internet by ID
    And User received message : wifi not found

  @Get-internet-by-Id-03
  Scenario: User belum berhasil mendapat data wifi dari id karena tidak menggunakan id
    Given User have endpoint auth login for get internet by ID
    When User send endpoint auth for get internet by ID feature and get token
    Then User set get internet by ID api endpoint with empty id
    Then User send HTTP request for get internet by ID with empty id
    And User received invalid HTTP response code 404 for get internet by ID
    And User received message : not found

  @Get-internet-by-Id-04
  Scenario: User belum berhasil mendapat data wifi dari id karena tidak login
    Given User set get internet by ID api endpoint
    When User send HTTP request for get internet by ID
    And User received valid HTTP response code 400 for get internet by ID because not login
    And User received message : missing or malformed jwt