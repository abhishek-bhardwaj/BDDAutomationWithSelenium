package singup.Product.automationWorld;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-html-reports","json:target/cucumber-html-reports/cucumber.json"},
        format = {"json:target/cucumber.json","html:target/generated-test-sourse/cucumber-preety"}
        ,features = {"C:\\Users\\abhishek.bhardwaj1\\Downloads\\SignUps\\SignUps\\src\\test\\Resources\\singup\\prod\\automationWorld\\features"}
,tags={"@test"}
//, glue = {"com.test.profile.StepDefs"}

)
public class RunCukesTest
{


}
