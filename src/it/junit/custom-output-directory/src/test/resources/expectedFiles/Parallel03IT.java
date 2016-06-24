import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features/feature1.feature"},
	tags = {"@accepted"},
    plugin = {"json:target/my-custom-dir/3.json", "pretty"},
    monochrome = false,    
    glue = { "foo", "bar" })
public class Parallel03IT {
}
