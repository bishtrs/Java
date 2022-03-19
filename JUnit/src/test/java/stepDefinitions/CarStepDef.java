package stepDefinitions;
import static org.junit.Assert.assertTrue;
import car.Car;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarStepDef {
	
	private Car car;
	
	@Given("^John goes to Car showroom$")
	public void john_goes_to_Car_showroom() throws Throwable {
		System.out.println("John goes to showroom");
	}

	@When("^John asks whether Car is of SUV type$")
	public void john_asks_whether_Car_is_of_SUV_type() throws Throwable {
		car = new Car(true);
	}

	@Then("^he should be told yes$")
	public void he_should_be_told_yes() throws Throwable {
		assertTrue(car.isSuvType());
	}

}
