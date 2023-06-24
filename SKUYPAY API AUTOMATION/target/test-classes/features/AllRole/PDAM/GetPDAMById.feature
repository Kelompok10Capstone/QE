Feature: Get PDAM By Id

  @Get-PDAM-by-Id-01
  Scenario: User berhasil mendapat data PDAM dari id
    Given User have endpoint auth login for get PDAM by ID
    When User send endpoint auth for get PDAM by ID feature and get token
    Then User set get PDAM by ID api endpoint
    Then User send HTTP request for get PDAM by ID
    And User received valid HTTP response code 200 for get PDAM by ID
    And User received valid data message success : Successfully get PDAM

  @Get-PDAM-by-Id-02
  Scenario: User belum berhasil mendapat data PDAM dari id karena menggunakan id yang salah
    Given User have endpoint auth login for get PDAM by ID
    When User send endpoint auth for get PDAM by ID feature and get token
    Then User set get PDAM by ID api invalid endpoint
    Then User send HTTP request for get PDAM by ID with invalid id
    And User received invalid HTTP response code 404 for get PDAM by ID
    And User received message : PDAM not found

  @Get-PDAM-by-Id-03
  Scenario: User belum berhasil mendapat data PDAM dari id karena tidak menggunakan id
    Given User have endpoint auth login for get PDAM by ID
    When User send endpoint auth for get PDAM by ID feature and get token
    Then User set get PDAM by ID api endpoint with empty id
    Then User send HTTP request for get PDAM by ID with empty id
    And User received invalid HTTP response code 404 for get PDAM by ID
    And User received message for PDAM : not found

  @Get-PDAM-by-Id-04
  Scenario: User belum berhasil mendapat data PDAM dari id karena tidak login
    Given User set get PDAM by ID api endpoint
    When User send HTTP request for get PDAM by ID
    And User received valid HTTP response code 400 for get PDAM by ID because not login
    And User received message for PDAM : missing or malformed jwt