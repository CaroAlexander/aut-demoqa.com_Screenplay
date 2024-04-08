Feature: Cases demoqa.com web

  Como usuario de la aplicación
  Quiero validar la funcionalidad de
  Para comprobar el correcto funcionamiento

  Background:
    Given I enter to ToolsQA page

#  @CaseTwo
#  Scenario Outline: extract text to print
#    Given I login with my user already created
#      | userName | password  |
#      | test01   | Test2023* |
#    When I extract the text
#      | text   |
#      | <text> |
#    Then the text are printed into the report
#    Examples:
#      | text         |
#      | Parent frame |
#      | Child Iframe |

  @CaseThree
  Scenario: fill the form
    Given I login with my user already created
      | userName | password  |
      | test01   | Test2023* |
    When I fill the form with data and submit it
      | firstName | lastName  | userEmail          | userNumber | subjectsInput | currentAddress             |
      | test01    | Test2023* | prueba@yopmail.com | 3004441234 | Aspirante     | Autopista Norte al oriente |
    Then the close button is shown
      | notificationMessage            |
      | Thanks for submitting the form |
