Feature: PDAM

  @PDAM-01
  Scenario: Admin berhasil menambahkan produk PDAM
    Given Admin melakukan login akun untuk fitur PDAM
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    Then Admin klik button + tambah PDAM
    And Admin input kode PDAM
    Then Admin input jenis PDAM
    And Admin input wilayah
    Then Admin klik simpan dan muncul popup berhasil

  @PDAM-02
  Scenario: Admin tidak dapat menambahkan produk PDAM karena tidak menginput kode PDAM
    Given Admin melakukan login akun untuk fitur PDAM
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    Then Admin klik button + tambah PDAM
    And Admin tidak input kode PDAM
    Then Admin input jenis PDAM
    And Admin input wilayah
    Then Admin klik simpan dan muncul eror message kode PDAM wajib diisi

  @PDAM-03
  Scenario: Admin tidak dapat menambahkan produk PDAM karena tidak menginput jenis PDAM
    Given Admin melakukan login akun untuk fitur PDAM
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    Then Admin klik button + tambah PDAM
    And Admin input kode PDAM
    Then Admin tidak input jenis PDAM
    And Admin input wilayah
    Then Admin klik simpan dan muncul eror message jenis PDAM wajib diisi

  @PDAM-04
  Scenario: Admin tidak dapat menambahkan produk PDAM karena tidak menginput field wilayah
    Given Admin melakukan login akun untuk fitur PDAM
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    Then Admin klik button + tambah PDAM
    And Admin input kode PDAM
    Then Admin tidak input jenis PDAM
    And Admin tidak input field wilayah
    Then Admin klik simpan dan muncul eror message wilayah wajib diisi

  @PDAM-05
  Scenario: Admin berhasil menggunakan fitur pencarian PDAM
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    And Admin klik field cari PDAM
    Then Admin input field cari PDAM
    And Admin klik enter pada field cari PDAM dan terlihat hasil pencarian

  @PDAM-06
  Scenario: Admin ingin mengubah nama jenis PDAM
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    And Admin klik icon edit pada salah satu produk
    Then Admin mengganti Nama jenis PDAM pada field jenis PDAM
    And Admin klik simpan dan muncul popup berhasil diubah

  @PDAM-07
  Scenario: Admin ingin mengubah nama wilayah PDAM
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    And Admin klik icon edit pada salah satu produk
    Then Admin mengganti wilayah PDAM pada field wilayah
    And Admin klik simpan dan muncul popup berhasil diubah

  @PDAM-08
  Scenario: Admin ingin menghapus salah satu nama produk PDAM
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    And Admin klik icon hapus pada salah satu produk
    Then Admin klik hapus dan muncul notifikasi berhasil dihapus atau produk berkurang satu

  @PDAM-09
  Scenario: Admin tidak dapat menghapus salah satu data produk PDAM karena kesalahan klik tidak jadi ingin dihapus
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Layanan
    And Admin klik PDAM
    And Admin klik icon hapus pada salah satu produk
    Then Admin klik batal