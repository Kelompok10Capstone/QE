Feature: Update Image

  @Update-Image-01
  Scenario: User berhasil mengubah gambar profil
    Given I have endpoint auth for update image user
    When I send endpoint auth for update image and get token
    Then I set update image api endpoint
    Then I send upload image HTTP request with format valid
    And I received valid HTTP response code 200 for update image
    And I received valid data for update image user

  @Update-Image-02
  Scenario: User belum berhasil mengubah gambar profil karena format gambar invalid
    Given I have endpoint auth for update image user
    When I send endpoint auth for update image and get token
    Then I set update image api endpoint
    Then I send upload image HTTP request with format invalid
    And I received valid HTTP response code 400 bad request
    And I received eror message : Uploaded image formats are only allowed png, jpg and jpeg

  @Update-Image-03
  Scenario: User belum berhasil mengubah gambar profil karena tidak authorization
    Given I set update image api endpoint
    When I send upload image HTTP request with no authorization
    And I received valid HTTP response code 400 bad request
    And I received eror message : missing or malformed jwt