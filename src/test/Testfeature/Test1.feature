Feature: ATM card feature
  user should be asked for the PIN once ATM card is inserted into ATM
  user should be  given warning message if PIN number inserted is wrong
  user should be authentication sucessful if entered correct PIN number

  Scenario: Enter the correct PIN at ATM
    Given I insert the ATM card in atm machine
    When I eneter correct PIN
    Then I should be able to see option to withdraw money
    Then I withdraw money

    Scenario: I eneter incorrect PIN at ATM
      Given I insert the ATM card in atm machine
      When  I eneter incorrect PIN
      Then  I should get warning message as PIN not correct
      Then I should get card back
