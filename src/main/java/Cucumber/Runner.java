package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/VI20466296/Downloads/Practice/IRCTC/src/main/java/Cucumber/Reguster.feature"
		,glue={"Cucumber"}
		)
public class Runner {

}
