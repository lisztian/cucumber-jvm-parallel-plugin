import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"src/test/resources/features/feature2.feature"},
    tags = {"@complete"},
    plugin = {"json:target/my-custom-dir/2.json", "pretty"},
    monochrome = false,
    glue = { "foo", "bar" })
public class Parallel02IT {
}
