package com.fada21.scala.template

class TemplateFeatureSpec extends BaseFeatureSpec {

  feature("BDD tests are ready to go") {

    info(
      """As a developer
        |I want to write some BDD tests
        |So that I can make my app more robust
      """.stripMargin)

    scenario("Some passing tests implemented") {

      Given(" I have passing test")
      val e = new IllegalStateException()

      When("I run the test")
      val thrown = intercept[IllegalStateException](throw e)

      Then("I get it passed")
      thrown shouldBe an[IllegalStateException]
    }

    scenario("Some failing tests implemented") {

      Given("I have failing test")
      val expectedTrue = false

      Then("I get a fail")
      assert(expectedTrue)
    }

    scenario("Some pending scenario prepared") {

      Given("I have something to test")
      When("I write some test")
      And("Run my tests")
      Then("Test can be run")
      And("Results are printed on the console")
      pending
    }

    scenario("Some planed scenario outlined")(pending)
  }

}
