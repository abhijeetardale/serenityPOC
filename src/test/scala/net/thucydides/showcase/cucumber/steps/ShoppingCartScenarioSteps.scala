package net.thucydides.showcase.cucumber.steps;

import cucumber.api.scala.{ScalaDsl, EN}
import net.thucydides.core.annotations.Steps
import org.scalatest.Matchers
;

/**
 * Created by john on 12/11/14.
 */
@Steps
class ShoppingCartScenarioSteps extends ScalaDsl with EN with Matchers{

    //@Steps
    //BuyerSteps buyer;

    Given("I add it to the cart") { ()=>
        //buyer.adds_current_listing_to_cart();
    }

    Then("the item should appear in the cart"){ () =>
        //ListingItem selectedItem = (ListingItem) Serenity.getCurrentSession().get(SELECTED_LISTING);
        //buyer.should_see_item_in_cart(selectedItem);
    }

    Then("the shipping cost should be included in the total price"){ () =>
        //ListingItem selectedItem = (ListingItem) Serenity.getCurrentSession().get(SELECTED_LISTING);
        //buyer.should_see_total_including_shipping_for(selectedItem);
    }

    //double itemCost;

    Given("I have selected an item that costs (.*)"){ (text:String) =>
    //public void itemCosts(double cost) {
       // itemCost = cost;
    }

    When("I review the total price"){ () =>
    //public void reviewTotalPrice() {
    }

    Then("the price should be (.*) including (.*) tax"){ (text:String) =>
    //public void priceShouldBe(double total, double tax) {
    }

}
