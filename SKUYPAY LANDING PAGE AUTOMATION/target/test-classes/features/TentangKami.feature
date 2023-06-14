Feature: Tentang Kami

  @Tentang-Kami-01
  Scenario: User ingin melihat "Tentang Kami"
    When User masuk ke halaman landing Page
    Then User klik "tentang kami"
    And Bergeser menuju section "tentang kami" di landing page