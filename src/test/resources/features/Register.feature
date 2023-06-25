@register
Feature: sebagai user saya berhasil melakukan register sehingga saya dapat login dengan akun baru

  @registerwithvaliddata
  Scenario: sebagai user saya dapat mendaftarkan akun baru saya
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi
    Then user klik tombol daftar
    And terdapat validasi berhasil mendaftar

  @RegisterPengisianNamaKosong
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena field Nama masih kosong
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama kosong
    And user click field Email
    And user input email
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi
    Then user klik tombol daftar
    And terdapat validasi harus mengisikan nama

  @RegisterPengisianEmailKosong
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena field Email masih kosong
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email kosong
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi
    Then user klik tombol daftar
    And terdapat validasi harus mengisikan email

  @RegisterPengisianEmailSudahTerdaftar
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena field Email sudah terdaftar
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email yang sudah terdaftar
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi
    Then user klik tombol daftar
    And terdapat validasi email sudah terdaftar


  @RegisterPengisianNoHPKosong
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena field No Hp kosong
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email
    And user click field kata sandi
    And user input kata sandi
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi
    Then user klik tombol daftar
    And terdapat validasi harus mengisikan no hp

  @RegisterPengisianKataSandiKosong
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena field kata sandi kosong
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi kosong
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi
    Then user klik tombol daftar
    And terdapat validasi harus mengisikan kata sandi

  @RegisterPengisianKetikUlangKataSandiKosong
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena field ketik ulang kata sandi kosong
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi kosong
    Then user klik tombol daftar
    And terdapat validasi harus mengisikan ketik ulang kata sandi

  @RegisterPengisianPasswordTidakCocok
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena password tidak cocok
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi 3
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi 4
    Then user klik tombol daftar
    And terdapat validasi harus password tidak cocok

  @RegisterPengisianPasswordKurangDari6Karakter
  Scenario: sebagai user saya tidak dapat mendaftarkan akun karena password kurang dari 6 karakter
    Given user berada di welcome screen
    When user klik lewati
    And user berada di halaman register
    And user click field nama
    And user input nama
    And user click field Email
    And user input email
    And user click field no hp
    And user input no hp
    And user click field kata sandi
    And user input kata sandi kurang dari 6 karakter
    And user click field ketik ulang kata sandi
    And user input ketik ulang kata sandi kurang dari 6 karakter
    Then user klik tombol daftar
    And terdapat validasi password kurang dari 6 karakter