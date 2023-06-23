Feature: Layanan Pulsa dan paket data

  @Pulsa-dan-Data-01
  Scenario: Admin berhasil menambahkan salah satu produk pulsa atau paket data
    Given Admin melakukan login akun untuk fitur pulsa dan paket data
    When Pada Beranda, Admin klik Layanan untuk fitur pulsa dan paket data
    And Admin klik Pulsa & Data
    Then Admin klik button + tambah Provider
    And Admin input kode Pulsa & Data
    Then Admin memilih provider
    And Admin memilih tipe pulsa
    Then Admin input harga
    And Admin input deskripsi
    Then Admin pilih memilih status aktif
    And Admin klik button simpan dan muncul pop up berhasil ditambahkan