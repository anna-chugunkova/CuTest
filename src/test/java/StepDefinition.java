import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by chugunkova_a on 29/12/2016.
 */
public class StepDefinition {
    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void the_price_of_a_is_c(String name, int price) throws Throwable {
       bananaPrice = price;
    }

    int bananaPrice;
    Checkout checkout;

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void I_checkout(int itemCount, String itemName) throws Throwable {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);

    }

    @Then("^the total price should be (\\d+)c$")
    public void the_total_price_should_be_c(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}
