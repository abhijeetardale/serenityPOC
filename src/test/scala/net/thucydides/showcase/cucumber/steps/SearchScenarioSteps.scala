package net.thucydides.showcase.cucumber.steps;

import cucumber.api.scala.{EN, ScalaDsl}
import net.thucydides.core.annotations.Steps

import org.scalatest.Matchers
;
@Steps
class SearchScenarioSteps extends ScalaDsl with EN with Matchers{
//    @Steps
  //  BuyerSteps buyer;

    Given("I (?:want|would like) to buy (.*)") { (text:String)=>
     //   buyer.opens_home_page();
    }

    When("I search for '(.*)'") { (text:String)=>
//        buyer.searches_by_keyword(keyword);
    }

    Then("I should see only articles related to '(.*)'")  { (text:String)=>
//        buyer.should_see_results_summary_containing(keyword);
    }

    Given("I want to see articles from a particular shop") { ()=>
    //    buyer.opens_home_page();
    }

    When("I search by shop for '(.*)'")  { (text:String)=>
//        buyer.should_see_nonexistant_field();
  //      buyer.searches_for_shop_called(shopName);
    }

    Then("I should find (\\d+) (?:shop|shops) called '(.*)'")  { (number:Int, text:String)=>
//        buyer.should_see_shop_search_result_summary_of(count, shopName);
    }

   /* private String pluralized(int count, String word) {
        return Inflector.getInstance().pluralize(word, count);

    }*/
}


