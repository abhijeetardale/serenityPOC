package utils

/**
  * Created by padmaa on 24/04/18.
  */

import cucumber.api.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith

@RunWith(classOf[CucumberWithSerenity])
@CucumberOptions(
  features = Array("src/test/resources/features/serenityPOC.feature"),
  glue = Array("stepdefs")
)
class SerenityPOCRunner



