Feature: Insurance (BPJS) untuk Insurance Biil Inquiry

  @Insurance-Biil-Inquiry-01
  Scenario: Admin berhasil mengecek data BPJS
    Given Admin have endpoint auth login for insurance biil inquiry
    When Admin send endpoint auth for insurance biil inquiry and get token
    Then Admin set insurance biil inquiry endpoint
    Then Admin send HTTP request for insurance biil inquiry
    And Admin received valid HTTP response code 200 for insurance biil inquiry
    And Admin received message success : success get all pulsa or paket data