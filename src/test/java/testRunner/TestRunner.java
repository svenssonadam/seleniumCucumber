package testRunner;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//Sad
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue="stepDefinitions")
public class TestRunner{
	
}