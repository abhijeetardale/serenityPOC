package net.thucydides.showcase.cucumber.steps;

import com.google.common.collect.Table
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import net.thucydides.core.annotations.Steps
import org.scalatest.Matchers

/**
 * Created by john on 27/05/2015.
 */
@Steps
class PetStoreSteps extends ScalaDsl with EN with Matchers{

    //List<Pet> pets;

    Given("I have the following pets?") { (requestData:DataTable) =>
//        this.pets = Lists.newArrayList(pets);
    }

    When("I add the pet to the store") { ()=>
//        for(Pet pet : pets ) {
//            int id = Math.abs(new Random().nextInt());
//            String jsonPet = "{\"id\": " + id + " , \"name\": \""
//                    + pet.getName() + "\", \"photoUrls\": [], \"status\": \""
//                    + pet.getStatus() + "\"}";
//
//            rest().given().contentType("application/json")
//                          .content(jsonPet).post("http://petstore.swagger.io/v2/pet");
//
//            pet.setId(id);
//        }
    }

    Then("the pets? should be available in the store") { () =>
        /*public void pets_should_be_available() {
        for(Pet pet : pets ) {
            rest().get("http://petstore.swagger.io/v2/pet/{id}", pet.getId())
                    .then().statusCode(200)
                    .and().body("name", equalTo(pet.getName()));
        }
    }*/
    }
}
