Feature: Layanan BPJS

  @BPJS-01
  Scenario: Admin berhasil menambahkan produk BPJS
    Given Admin melakukan login akun untuk fitur BPJS
    When Pada Beranda, Admin klik Layanan untuk fitur BPJS
    And Admin klik BPJS
    Then Admin klik button + tambah BPJS
    And Admin input kode BPJS
    Then Admin input jenis BPJS
    And Admin klik button simpan dan muncul pop up berhasil ditambahkan BPJS
    Then produk berhasil ditambah dan kembali ke halaman BPJS