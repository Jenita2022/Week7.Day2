package runners_H;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features_H/EditLead_Hooks.feature", glue={"steps_H","hooks"}, monochrome = true, publish = true)
public class EditLeadRunners_Hooks extends AbstractTestNGCucumberTests {
}
