Feature: Insurance Pay Bill

  @Insurance-Pay-Bill-01
  Scenario: User berhasil membayar tagihan BPJS
    Given User have endpoint auth login for insurance pay bill
    When User send endpoint auth for insurance pay bill and get token
    Then User set insurance pay bill endpoint
    Then User send HTTP request for insurance pay bill
    And User received valid HTTP response code 202 for insurance pay bill
    And User received message success for insurance pay : Succesfully pay bill