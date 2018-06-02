package net.thucydides.showcase.cucumber.steps;

import cucumber.api.scala.{EN, ScalaDsl}
import net.thucydides.core.annotations.Steps
import org.scalatest.Matchers
@Steps
class DisplayProductDetailsScenarioSteps  extends ScalaDsl with EN with Matchers{

   // @Steps
    //BuyerSteps buyer;

    //HomePage homePage;

    Given("I have searched for '(.*)' in my region"){ (text:String)=>
//    public void givenIHaveSearchedFor(String searchTerm) {
//
//        homePage.open();
//
//        buyer.opens_home_page();
//        buyer.searches_by_keyword(searchTerm);
//        buyer.filters_by_local_region();
    }

    When("I (?:have selected|select) item (\\d+)") { (text:Int)=>
//    public void whenISelectListingItem(int number) {
//        ListingItem selectedListingItem = buyer.selects_listing(number);
//        Serenity.setSessionVariable(SELECTED_LISTING).to(selectedListingItem);
    }

    Then("I should see product description and price on the details page") { ()=>
//    public void thenIShouldSeeProductDescriptionAndPriceOnTheDetailsPage() {
//         ListingItem selectedListingItem = (ListingItem) Serenity.sessionVariableCalled(SELECTED_LISTING);
//         buyer.should_see_product_details_for(selectedListingItem);
    }

    Then("I should see a product rating"){ ()=>
//    public void shouldSeeProductRating() {
//        buyer.should_see_product_rating();
    }

    Then("I should see social media links") { ()=>
//    public void shouldSeeSocialMediaLinks() {
//        buyer.should_see_facebook_link();
//        buyer.should_see_twitter_link();
//        buyer.should_see_tumblr_link();
    }
}
