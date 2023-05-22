package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

 features = "/Users/VI20466296/Downloads/Practice/IRCTC/src/main/java/Features/Login.Feature"

 ,glue={"Bindings"},

 tags="@Brands",

 dryRun = true,

 monochrome = true,

 plugin = {"pretty", "html:target/cucumber-reports"}

 )

public class Runner {





}


