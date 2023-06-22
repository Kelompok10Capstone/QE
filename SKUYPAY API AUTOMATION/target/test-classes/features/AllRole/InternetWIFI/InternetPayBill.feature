Feature: Internet Pay Bill

  @Internet-Pay-Bill-01
  Scenario: User berhasil membayar WiFi
    Given User have endpoint auth login for internet pay bill
    When User send endpoint auth for internet pay bill and get token
    Then User set internet pay bill endpoint
    Then User send HTTP request for internet pay bill
    And User received valid HTTP response code 202 for internet pay bill
    And User received message success : Successfully pay bill