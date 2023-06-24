Feature: Insurance Pay Bill

  @Insurance-Pay-Bill-01
  Scenario: User berhasil membayar tagihan BPJS
    Given User have endpoint auth login for insurance pay bill
    When User send endpoint auth for insurance pay bill and get token
    Then User set insurance pay bill endpoint
    Then User send HTTP request for insurance pay bill
    And User received valid HTTP response code 202 for insurance pay bill
    And User received message success for insurance pay : Succesfully pay bill

  @Insurance-Pay-Bill-02
  Scenario: User belum berhasil membayar tagihan BPJS karena telah dibayar
    Given User have endpoint auth login for insurance pay bill
    When User send endpoint auth for insurance pay bill and get token
    Then User set insurance pay bill endpoint
    Then User send HTTP request for insurance pay bill with paid id
    And User received invalid HTTP response code 500 for insurance pay bill
    And User received message eror for insurance pay : this month's bill has been paid

  @Insurance-Pay-Bill-03
  Scenario: User belum berhasil membayar tagihan BPJS karena kesalahan nomor id
    Given User have endpoint auth login for insurance pay bill
    When User send endpoint auth for insurance pay bill and get token
    Then User set insurance pay bill endpoint
    Then User send HTTP request for insurance pay bill with invalid id
    And User received invalid HTTP response code 500 for insurance pay bill
    And User received message eror for insurance pay : record not found

  @Insurance-Pay-Bill-04
  Scenario: User belum berhasil membayar tagihan BPJS karena tidak login
    Given User set insurance pay bill endpoint
    When User send HTTP request for insurance pay bill
    And User received invalid HTTP response code 400 for insurance pay bill because not login
    And User received message eror for insurance pay : missing or malformed jwt