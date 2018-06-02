package net.thucydides.showcase.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(classOf[CucumberWithSerenity])
@CucumberOptions(
  features = Array("src/test/resources/features/display_product_details.feature")
)
class DisplayProductDetails
