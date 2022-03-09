Feature:
  Scenario Outline: connection successfully
    Given as a user I am on the loginpage
    And Enter valid email <email>
    And Enter valid password <password>
    And Click on "connexion"
    Then I am connected

    Examples:
      |email        |password|
      |test@test.com|12345678|

  Scenario : access to the resetPassword page
    Given as a user I am on the loginpage
    And Click on "Mot de passe oublié?"
    Then I am on the resetPassword page


  Scenario Outline: successful resetPassword
    Given as a user I am on the loginpage
    And Click on "Mot de passe oublié?"
    And Fill email  <emailrst>
    And Fill new Password  <newPasswordrst>
    And Click on "Réenitialiser"
    Then we observe the pop pup which indicates "votre mot de passe a été réinitialisé "

    Examples:
      |emailrst        |newPasswordrst   |
      |test@test.com   |12345678         |


