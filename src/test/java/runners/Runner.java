package runners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utilities.Driver;


@RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/default-cucumber-reports",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"
            },
            features = "src/test/resources/features",
            glue = "stepdefinitions",
            //tags="(@haberlertummenu or @inceletummenu or @karsilastirtummenu or  @kriptoparatummenu or@iletisimtummenu or @siberGuvenliktummenu)",
            dryRun = false


    )
    public class Runner {

    }
