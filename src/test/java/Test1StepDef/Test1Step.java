package Test1StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1Step {
    @Given("^I insert the ATM card in atm machine$")
    public void i_insert_the_ATM_card_in_atm_machine() throws Throwable {
        System.out.println("^I insert the ATM card in atm machine$");


    }

    @When("^I eneter correct PIN$")
    public void i_eneter_correct_PIN() throws Throwable {
        System.out.println("^I eneter correct PIN$");

    }

    @Then("^I should be able to see option to withdraw money$")
    public void i_should_be_able_to_see_option_to_withdraw_money() throws Throwable {
        System.out.println("^I should be able to see option to withdraw money$");
    }

    @Then("^I withdraw money$")
    public void i_withdraw_money() throws Throwable {
        System.out.println("^I withdraw money$");

    }

    @When("^I eneter incorrect PIN$")
    public void i_eneter_incorrect_PIN() throws Throwable {
        System.out.println("^$");

    }

    @Then("^I should get warning message as PIN not correct$")
    public void i_should_get_warning_message_as_PIN_not_correct() throws Throwable {
        System.out.println("^I eneter incorrect PIN$");

    }

    @Then("^I should get card back$")
    public void i_should_get_card_back() throws Throwable {
        System.out.println("^I should get card back$");

    }



}
