import org.junit.Assert

import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace

File suite01 = new File(basedir, "target/generated-test-sources/cucumber/Parallel01IT.java");
File suite02 = new File(basedir, "target/generated-test-sources/cucumber/Parallel02IT.java");
File suite03 = new File(basedir, "target/generated-test-sources/cucumber/Parallel03IT.java");
File suite04 = new File(basedir, "target/generated-test-sources/cucumber/Parallel04IT.java");

File feature1 = new File(basedir, "/src/test/resources/features/feature1.feature");
File feature2 = new File(basedir, "/src/test/resources/features/feature2.feature");

assert suite01.isFile()
assert suite02.isFile()
assert suite03.isFile()
assert suite04.isFile()

String expected01 =
        """import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"${feature1.absolutePath}:4"}, plugin = {"json:target/cucumber-parallel/1.json"},
monochrome = false, glue = { "foo", "bar" })
public class Parallel01IT {
}"""

String expected02 =
        """import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"${feature1.absolutePath}:18"}, plugin = {"json:target/cucumber-parallel/2.json"},
monochrome = false, glue = { "foo", "bar" })
public class Parallel02IT {
}"""

String expected03 =
        """import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"${feature2.absolutePath}:4"}, plugin = {"json:target/cucumber-parallel/3.json"},
monochrome = false, glue = { "foo", "bar" })
public class Parallel01IT {
}"""

String expected04 =
        """import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"${feature2.absolutePath}:18"}, plugin = {"json:target/cucumber-parallel/4.json"},
monochrome = false, glue = { "foo", "bar" })
public class Parallel02IT {
}"""

// Depending on the OS, listFiles can list files in different order.  The actual order of files isn't necessary

if (suite01.text.contains("feature1")) {
    System.out.println(suite01.text);
    Assert.assertThat(suite01.text, equalToIgnoringWhiteSpace(expected01))
} 
if (suite02.text.contains("feature2")) {
        System.out.println(suite02.text);
   Assert.assertThat(suite02.text, equalToIgnoringWhiteSpace(expected02))
} 
if (suite03.text.contains("feature3")) {
        System.out.println(suite03.text);
   Assert.assertThat(suite03.text, equalToIgnoringWhiteSpace(expected03))
} 

if (suite04.text.contains("feature4")) {
        System.out.println(suite04.text);
   Assert.assertThat(suite04.text, equalToIgnoringWhiteSpace(expected04))
} 

