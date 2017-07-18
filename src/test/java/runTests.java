import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by nitinm on 26/05/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        //glue = {"src/test/java/stepdefinitions"},
//        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags = {"@wip"}
)

public class runTests {
}
