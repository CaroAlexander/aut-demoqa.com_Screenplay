@Regression
Feature: Cases demoqa.com web

  Como usuario de la aplicación
  Quiero validar la funcionalidad de
  Para comprobar el correcto funcionamiento

  Background:
    Given I enter to ToolsQA page

  @CaseOne
  Scenario: Create and delete account to add and delete books to the collection
    Given I create an account
      | firstName | lastName | userName | password  |
      | Test01    | Test01   | test01   | Test2023* |
    When register the books
      | Book                   |
      | Programming JavaScript |
    And Delete the book and the account
      | Book                   |
      | Programming JavaScript |
    Then Only the book is are register


