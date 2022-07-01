package runners_H;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features_H/DeleteLead_Hooks.feature", glue= {"steps_H","hooks"},monochrome = true,publish = true)
public class DeleteLeadRunner_Hooks extends AbstractTestNGCucumberTests{

}
