Feature: Transaksi

  @Transaksi-01
  Scenario: Admin dapat melihat semua riwayat transaksi
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Transaksi
    And Admin klik Semua

  @Transaksi-02
  Scenario: Admin dapat melihat semua riwayat transaksi yang difilter hanya status selesai saja
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Transaksi
    And Admin klik Selesai

  @Transaksi-03
  Scenario: Admin dapat melihat semua riwayat transaksi yang difilter hanya status belum bayar saja
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Transaksi
    And Admin klik belum bayar

  @Transaksi-04
  Scenario: Admin dapat melihat semua riwayat transaksi yang difilter hanya status gagal saja
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Transaksi
    And Admin klik Gagal

  @Transaksi-05
  Scenario: Admin dapat mencari transaksi
    Given Admin melakukan login akun
    When Pada Beranda, Admin klik Transaksi
    And Admin klik field cari
    Then Admin input field cari
    And Admin klik enter dan terlihat hasil pencarian
