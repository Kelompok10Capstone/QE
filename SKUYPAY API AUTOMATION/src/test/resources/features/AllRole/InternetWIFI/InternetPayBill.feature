Feature: Internet Pay Bill

  @Internet-Pay-Bill-01
  Scenario: User berhasil membayar WiFi
    Given User have endpoint auth login for internet pay bill
    When User send endpoint auth for internet pay bill and get token
    Then User set internet pay bill endpoint
    Then User send HTTP request for internet pay bill
    And User received valid HTTP response code 202 for internet pay bill
    And User received message success : Successfully pay bill

  @Internet-Pay-Bill-01
  Scenario: User belum berhasil membayar WiFi karena telah dibayar
    Given User have endpoint auth login for internet pay bill
    When User send endpoint auth for internet pay bill and get token
    Then User set internet pay bill endpoint
    Then User send HTTP request for internet pay bill with paid id
    And User received invalid HTTP response code 500 for internet pay bill
    And User received message eror for internet pay : this month's bill has been paid

  @Insurance-Pay-Bill-03
  Scenario: User belum berhasil membayar tagihan BPJS karena kesalahan nomor id
    Given User have endpoint auth login for internet pay bill
    When User send endpoint auth for internet pay bill and get token
    Then User set internet pay bill endpoint
    Then User send HTTP request for internet pay bill with invalid id
    And User received invalid HTTP response code 500 for internet pay bill
    And User received message eror for internet pay : record not found

  @Insurance-Pay-Bill-04
  Scenario: User belum berhasil membayar tagihan BPJS karena tidak login
    Given User set internet pay bill endpoint
    When User send HTTP request for internet pay bill
    And User received invalid HTTP response code 400 for internet pay bill because not login
    And User received message eror for internet pay : missing or malformed jwt