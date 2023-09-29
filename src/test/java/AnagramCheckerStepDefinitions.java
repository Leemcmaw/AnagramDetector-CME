//import org.junit.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
//
//public class AnagramCheckerStepDefinitions {
//    private AnagramDetector anagramChecker;
//    private String username;
//    private String text1;
//    private String text2;
//    private String resultMessage;
//
//    @Given("^I am using the Anagram Checker$")
//    public void iAmUsingTheAnagramChecker() {
//        anagramChecker = new AnagramDetector();
//    }
//
//    @When("^I enter my username as \"([^\"]*)\"$")
//    public void iEnterMyUsernameAs(String username) {
//        this.username = username;
//    }
//
//    @And("^I enter the first text value as \"([^\"]*)\"$")
//    public void iEnterTheFirstTextValueAs(String text1) {
//        this.text1 = text1;
//    }
//
//    @And("^I enter the second text value as \"([^\"]*)\"$")
//    public void iEnterTheSecondTextValueAs(String text2) {
//        this.text2 = text2;
//    }
//
//    @And("^I choose to continue$")
//    public void iChooseToContinue() {
//        // Implement code to continue based on the user's choice
//    }
//
//    @Then("^I should see the message \"([^\"]*)\"$")
//    public void iShouldSeeTheMessage(String expectedMessage) {
//        Assert.assertEquals(expectedMessage, resultMessage);
//    }
//
//    // Additional step definitions for specific scenarios can be added here
//}
