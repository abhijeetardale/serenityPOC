package stepdefs

import cucumber.api.PendingException
import cucumber.api.scala.{EN, ScalaDsl}
import net.thucydides.core.annotations.Steps
import org.scalatest.Matchers
import pages.{AmazonPage, BasePage}

/**
  * Created by padmaa on 24/04/18.
  */


@net.thucydides.core.annotations.Steps
class serenityPOC extends ScalaDsl with EN with Matchers {

 val amazonPage : AmazonPage = AmazonPage

  Given("""^I navigate to amazon website$"""){ () =>
    //// Write code here that turns the phrase above into concrete actions
    amazonPage.getURL
  }

//  Given("""^I navigate to amazon website$"""){()=>
//    amazonPage.getURL
//  }

  And("""^I click the all items on the amazon home page$"""){()=>

  }

  And("""^I select Books in the product dropdown$"""){()=>

  }

  And("""^I type in '(.*)' in the search box$"""){(productName:String)=>
   amazonPage.selectDropdown
  }

  And("""^I press enter$"""){()=>
    amazonPage.pressEnter
  }

  Then("""^I am on the results page$"""){()=>

  }

  Then("""^I see that the first result has the name '(.*)' in it$"""){(result:String)=>
    amazonPage.assertSearchText(result)
  }

  And("""^I hover mouse over '(.*)' to '(.*)' and click '(.*)'$"""){(productType1:String, productType2:String, productType3:String)=>
    amazonPage.mouseOverGrocery
  }

  And("""^I hover mouse over '(.*)' sub menu$"""){(productType2:String)=>

  }

  And("""^I click on '(.*)'$"""){(product:String)=>

  }

  Then("""^I see '(.*)' in the H2 on results page$"""){(resultH2:String)=>
    amazonPage.assertSearchText(resultH2)
    amazonPage.closeBrowser
  }

  Then("""^I clear the shopping basket$"""){()=>

  }

  Then("""^I go to homepage of amazon website$"""){()=>

  }

  And("""^I select '(.*)' on the products page$"""){(productType:String)=>

  }

  And("""^I click add to the basket on the product page$"""){()=>

  }

  And("""^I see the shopping cart has (.*) item in it$"""){(numberOfItems:Int)=>

  }

  And("""^I close the browser$"""){()=>
    amazonPage.closeBrowser
  }

}
