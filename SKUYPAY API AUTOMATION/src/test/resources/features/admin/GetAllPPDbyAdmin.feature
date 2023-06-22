Feature: Get All PPD by Admin

  @Get-all-PPD-by-admin-01
  Scenario: Admin berhasil mendapat detail semua paket data dan pulsa (Telkomsel)
    Given Admin have endpoint auth login for get PPD
    When Admin send endpoint auth for get PDD feature and get token
    Then Admin set get PPD api endpoint
    Then Admin send HTTP request with params for all
    And Admin received valid HTTP response code 200 for get detail PPD by admin
    And Admin received message success : success get all pulsa or paket data

  @Get-all-PPD-by-admin-02
  Scenario: Admin berhasil mendapat detail semua pulsa (Telkomsel)
    Given Admin have endpoint auth login for get PPD
    When Admin send endpoint auth for get PDD feature and get token
    Then Admin set get PPD api endpoint
    Then Admin send HTTP request with params for only pulsa
    And Admin received valid HTTP response code 200 for get detail PPD by admin
    And Admin received message success : success get all pulsa or paket data

  @Get-all-PPD-by-admin-03
  Scenario: Admin berhasil mendapat detail semua pulsa (Telkomsel)
    Given Admin have endpoint auth login for get PPD
    When Admin send endpoint auth for get PDD feature and get token
    Then Admin set get PPD api endpoint
    Then Admin send HTTP request with params for only paket data
    And Admin received valid HTTP response code 200 for get detail PPD by admin
    And Admin received message success : success get all pulsa or paket data

  @Get-all-PPD-by-admin-04
  Scenario: Admin belum berhasil mendapat detail semua paket data dan pulsa (Telkomsel) karena tidak login terlebih dahulu
    Given Admin set get PPD api endpoint
    When Admin send HTTP request with params for all
    And Admin received invalid HTTP response code 400 for get detail PPD by admin
    Then Admin received message success : missing or malformed jwt






