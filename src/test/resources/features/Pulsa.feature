@Pulsa
Feature: sebagai user saya berhasil mengakses dan melakukan transaksi pulsa

  @transaksiPulsa
  Scenario: sebagai user saya dapat mendaftarkan akun baru saya
    Given user berada di welcome screen
    When user klik lewati
    And user click tombol Masuk
    And user click email field
    And user input email field
    And user click password field
    And user input password field
    And user click tombol Login
    And user click menu Pulsa&Data
    And user click nomor handphone field
    And user input nomor handphone field
    And user click tombol Lanjutkan
    And user on Payment page



