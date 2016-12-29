import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by chugunkova_a on 29/12/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:reports/test-report"}, tags = "@smokeTest")

public class CucumberRunner {

}
