package co.com.homecenter.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features ="resources/features/HomecenterSearch.feature",
		glue="co.com.homecenter.stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class HomecenterRunner {
}