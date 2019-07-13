package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="\\Cucumberframework\\CucumberFastrack\\src\\Features\\FTlogin.feature",
                 glue={"stepdefinations"},
                 format={"pretty","html:test-Output"},
                 monochrome=true,
                 dryRun=false)

public class TestRunner 
{

}
