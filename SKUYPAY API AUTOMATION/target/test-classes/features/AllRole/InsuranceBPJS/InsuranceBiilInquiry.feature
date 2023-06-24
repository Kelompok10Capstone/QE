Feature: Insurance (BPJS) untuk Insurance Biil Inquiry

  @Insurance-Biil-Inquiry-01
  Scenario: User berhasil memeriksa sistem dapat menghasilkan tagihan asuransi yang belum dibayar
    Given User have endpoint auth login for insurance biil inquiry
    When User send endpoint auth for insurance biil inquiry and get token
    Then User set insurance biil inquiry endpoint
    Then User send HTTP request for insurance biil inquiry with unpaid customer id
    And User received valid HTTP response code 200 for insurance biil inquiry
    And User received message success : Succesfully Get Bill

  @Insurance-Biil-Inquiry-02
  Scenario: User belum berhasil memeriksa sistem dapat menghasilkan tagihan asuransi yang belum dibayar karena sudah dibayar
    Given User have endpoint auth login for insurance biil inquiry
    When User send endpoint auth for insurance biil inquiry and get token
    Then User set insurance biil inquiry endpoint
    Then User send HTTP request for insurance biil inquiry with paid customer id
    And User received invalid HTTP response code 500 for insurance biil inquiry
    And User received message eror : this month's bill has been paid

  @Insurance-Biil-Inquiry-03
  Scenario: User belum berhasil memeriksa sistem dapat menghasilkan tagihan asuransi yang belum dibayar karena belum login
    Given User set insurance biil inquiry endpoint
    When User send HTTP request for insurance biil inquiry with paid customer id
    And User received invalid HTTP response code 400 for insurance biil inquiry because not login
    And User received message eror : missing or malformed jwt