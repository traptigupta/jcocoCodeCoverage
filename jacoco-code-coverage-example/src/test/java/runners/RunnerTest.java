package runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions( features = "src/test/java/features" ,glue= {"stepDefinations"} , plugin  = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}
)

public class RunnerTest {

}
