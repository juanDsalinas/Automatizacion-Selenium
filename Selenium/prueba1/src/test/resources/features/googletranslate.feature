Feature: Google Translate
  As a web user
  I want to use google translate
  to translate words between different languages
  Scenario: Translate from English to Spanish
    Given that Susan wants to translate a word
    When she translates the word cheese from English to Spanish
    Then she should see the word queso in the screen
