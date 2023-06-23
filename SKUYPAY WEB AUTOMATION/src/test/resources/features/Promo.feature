Feature: Promo

  @Promo-01
  Scenario: Admin berhasil menambahkan produk promo
    Given Admin melakukan login akun untuk fitur promo
    When Pada Beranda, Admin klik Layanan untuk fitur promo
    And Admin klik Promo
    Then Admin klik button + tambah Promo
    And Admin input kode promo
    Then Admin input deskripsi promo
    And Admin upload gambar logo promo
    Then Admin input nominal potongan
    Then Admin klik simpan dan muncul popup berhasil nambah promo
    And Admin berada kembali ke halaman promo