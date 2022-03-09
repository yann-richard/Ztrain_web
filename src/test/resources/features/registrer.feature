#Feature:
#  Scenario: Access to the account creation page
#    Given as a user I am on the loginpage
#    And Click on "S'inscrire"
#    Then I am on the registrer page
#
##
##
##
#  Scenario Outline: Successful account creation
#    Given as a user I am on the loginpage
#    And Click on "S'inscrire"
#    And write email for registration <emailRgter>
#    And write adress for registration <adressRgter>
#    And write age for registration <ageRgter>
#    And write password for registration <passwordRgter>
#    And Click on "inscription"
#    And Go to loginPage
#    And Enter valid email <emailRgter>
#    And Enter valid password <passwordRgter>
#    And Click on "connexion"
#    Then I am connected
#
#    Examples:
#      |emailRgter          |passwordRgter     |ageRgter    |adressRgter|
#      |newaccount@test.com |12345678          |25          |BANGA      |
##
#  Scenario: Access to the login page from the account creation page
#    Given as a user I am on the loginpage
#    And Click on "S'inscrire"
#    And Click on "Se_connecter"
#    Then you are on the login page