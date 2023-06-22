Feature: Delete PPD use id by Admin

  @Delete-PPD-by-Admin-01
  Scenario: Admin berhasil menghapus salah satu id pulsa
    Given Admin have endpoint auth login for delete PPD
    When Admin send endpoint auth for delete PPD and get token
    Then Admin set delete PPD api endpoint
    Then Admin send HTTP request with params Pulsa id
    And Admin received valid HTTP response code 200 for delete PPD by admin
    And Admin received message success : pulsa or paket data deleted successfully

  @Delete-PPD-by-Admin-02
  Scenario: Admin berhasil menghapus salah satu id paket data
    Given Admin have endpoint auth login for delete PPD
    When Admin send endpoint auth for delete PPD and get token
    Then Admin set delete PPD api endpoint
    Then Admin send HTTP request with params Paket data id
    And Admin received valid HTTP response code 200 for delete PPD by admin
    And Admin received message success : pulsa or paket data deleted successfully

  @Delete-PPD-by-Admin-03
  Scenario: Admin belum berhasil menghapus salah satu id pulsa karena belum login
    Given Admin set delete PPD api endpoint
    When Admin send HTTP request with params Pulsa id
    And Admin received invalid HTTP response code 400 for delete PPD by admin
    And Admin received eror message : missing or malformed jwt