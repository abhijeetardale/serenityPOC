package net.thucydides.showcase.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(classOf[CucumberWithSerenity])
@CucumberOptions(
  features = Array("src/test/resources/features/add_item_to_shopping_cart.feature")
)
class AddItemToShoppingCart
