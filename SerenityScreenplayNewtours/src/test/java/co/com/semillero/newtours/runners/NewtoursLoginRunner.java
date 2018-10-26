package co.com.semillero.newtours.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features ="resources/features/NewtoursLogin.feature",
		glue="co.com.semillero.newtours.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class NewtoursLoginRunner {
}