Feature: Layanan Wifi

  @Wifi-01
  Scenario: Admin berhasil menambahkan produk wifi
    Given Admin melakukan login akun untuk fitur wifi
    When Pada Beranda, Admin klik Layanan untuk fitur wifi
    And Admin klik Wifi
    Then Admin klik button + tambah wifi
    And Admin input kode wifi
    Then Admin input jenis wifi
    And Admin klik button simpan dan muncul pop up berhasil ditambahkan wifi