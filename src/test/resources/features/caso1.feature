@Regression
Feature: Casos web demoqa

  Como usuario de la aplicación
  Quiero validar la funcionalidad de
  Para comprobar el correcto funcionamiento

  @Caso1
  Scenario: Validar la longitud de cuenta corriente
    Given I enter to ToolsQA page
    When I create an account
    And register a book
    Then the book is register
