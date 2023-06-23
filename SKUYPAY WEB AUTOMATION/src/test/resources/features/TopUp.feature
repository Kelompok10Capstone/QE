Feature: Top Up

  @Top-Up-01
  Scenario: Admin berhasil menambahkan metode top up
    Given Admin melakukan login akun untuk fitur top up
    When Pada Beranda, Admin klik Layanan untuk fitur top up
    And Admin klik Top Up
    Then Admin klik button + tambah Bank
    And Admin input kode Bank
    Then Admin input nama bank
    And Admin upload gambar logo bank
    Then Admin klik simpan dan muncul popup berhasil untuk top up
    And Admin berada kembali ke halaman top up