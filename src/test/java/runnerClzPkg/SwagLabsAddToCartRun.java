package runnerClzPkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(

		features = "src/test/java/featurePkg/SwagLabAddToCart.feature",
		glue = "stepDefinition"
		)

public class SwagLabsAddToCartRun  extends AbstractTestNGCucumberTests{

}
