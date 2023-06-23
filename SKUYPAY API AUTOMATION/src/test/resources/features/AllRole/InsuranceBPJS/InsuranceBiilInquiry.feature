Feature: Insurance (BPJS) untuk Insurance Biil Inquiry

  @Insurance-Biil-Inquiry-01
  Scenario: User berhasil mengecek tagihan transaksi BPJS nya
    Given User have endpoint auth login for insurance biil inquiry
    When User send endpoint auth for insurance biil inquiry and get token
    Then User set insurance biil inquiry endpoint
    Then User send HTTP request for insurance biil inquiry
    And User received valid HTTP response code 200 for insurance biil inquiry
    And User received message success : Succesfully Get Bill