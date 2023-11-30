package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.getSqrtOfDivision(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+\\.\\d+)$")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result, 0.001);
    }
}
