package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//runner class we write the code after the package & before the class

//How do Configere testNg with Cucumber?
//How to run runner class?

 @CucumberOptions(
		 plugin = {"pretty","json:target/cucumber.json"},    // plugin is nothing but generate the report
		 features = {".//Feature/"},// feature is nothing but location of features file
		 glue = {"smarttech.ny.stepdefination","smarttech.ny.hooks"}     // glue is nothing but location of stepdefination
		 )

 public class MyRunner  extends AbstractTestNGCucumberTests{

}
