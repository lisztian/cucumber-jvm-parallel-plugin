@feature1
Feature: Feature1

  Scenario: Generate Junit Runner for each feature file
    Given I have feature files
    When I generate Maven sources
    Then the file "target/generated-test-sources/1IT.java" should exist
    And it should contain:
    """
    @RunWith(Cucumber.class)
    @CucumberOptions(strict = true, features = {"classpath:features/feature1.feature"}, format = {"json:target/cucumber-parallel/1.json",
    "pretty"}, monochrome = false, tags = {"@complete", "@accepted"}, glue = { "foo", "bar" })
    public class Parallel01IT {
    }
    """

   @feature1
   Scenario Outline: Generate Junit runner for each outline
     Given I have "<examples>"
     Examples:
     |examples |
     |    example1   |
     |    example2   |
     |    example3   |
     |    example4   |
