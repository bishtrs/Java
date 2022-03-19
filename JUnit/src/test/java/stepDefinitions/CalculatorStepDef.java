package stepDefinitions;

import static org.junit.Assert.assertEquals;

import calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDef {
	
	private int a;
	private int b;
	private int c;
	private Calculator calculator = new Calculator();  
	
	@Given("^two numbers$")
	public void two_numbers() {
		a = 10;
		b = 4;
	}

	@When("^subtract one number from other$")
	public void subtract_one_number_from_other() throws Throwable {
	    c = calculator.subtract(a, b);
	}

	@Then("^correct difference should br returned$")
	public void correct_difference_should_br_returned() throws Throwable {
		assertEquals(6,c);
	}

}
