Feature: Login User

  @Login-01
  Scenario: User mendapatkan data token dari fitur login
    Given I set login api endpoint for login feature
    When I send login HTTP request for login feature
    Then I received valid HTTP response code 200 for login
    Then I received valid data for login

  @Login-02
  Scenario: User tidak mendapatkan data token dari fitur login karena kredensial password tidak valid
    Given I set login api endpoint for login feature
    When I send login HTTP request with invalid data for login feature
    Then I received invalid HTTP response code 400 for login
    Then I received error message : invalid email or password

  @Login-03
  Scenario: User tidak mendapatkan data token dari fitur login karena nama email tidak terdaftar
    Given I set login api endpoint for login feature
    When I send login HTTP request with invalid email not registered
    Then I received invalid HTTP response code 400 for login
    Then I received error message : user not found

  @Login-04
  Scenario: User tidak mendapatkan data token dari fitur login karena parameter email tidak diisi
    Given I set login api endpoint for login feature
    When I send login HTTP request with no input email
    Then I received invalid HTTP response code 400 for login
    Then I received error message : email field is required

  @Login-05
  Scenario: User tidak mendapatkan data token dari fitur login karena parameter email tidak diisi
    Given I set login api endpoint for login feature
    When I send login HTTP request with no input password
    Then I received invalid HTTP response code 400 for login
    Then I received error message : password field is required


