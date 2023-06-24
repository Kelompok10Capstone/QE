Feature:Kebijakan Keamanan

  @Kebijakan-Kemananan-01
  Scenario: User membuka kebijakan keamanan
    Given user telah login akun untuk fitur kebijakan keamanan
    When user klik akun untuk fitur kebijakan keamanan
    Then user klik kebijakan keamanan
    And user bisa melihat screen kebijakan keamanan