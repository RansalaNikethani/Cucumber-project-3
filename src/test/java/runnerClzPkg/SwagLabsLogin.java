package runnerClzPkg;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

		features = "src/test/java/featurePkg/SwagLabLogin.feature",
		glue = "stepDefinition"
		)


public class SwagLabsLogin extends AbstractTestNGCucumberTests{

}
