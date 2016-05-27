/**
 * 
 */
package com.cucumber.bdd.thinkcode.book;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author ravia
 *
 */
public class BookSearchSteps {

	@Given("^a book with the title 'One good book', written by 'Anonymous', published in (\\d+) March (\\d+)$")
	public void a_book_with_the_title_One_good_book_written_by_Anonymous_published_in_March(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^another book with the title 'Some other book', written by 'Tim Tomson', published in (\\d+) August (\\d+)$")
	public void another_book_with_the_title_Some_other_book_written_by_Tim_Tomson_published_in_August(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^another book with the title 'How to cook a dino', written by 'Fred Flintstone', published in (\\d+) January (\\d+)$")
	public void another_book_with_the_title_How_to_cook_a_dino_written_by_Fred_Flintstone_published_in_January(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the customer searches for books published between (\\d+) and (\\d+)$")
	public void the_customer_searches_for_books_published_between_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^(\\d+) books should have been found$")
	public void books_should_have_been_found(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Book (\\d+) should have the title 'Some other book'$")
	public void book_should_have_the_title_Some_other_book(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Book (\\d+) should have the title 'One good book'$")
	public void book_should_have_the_title_One_good_book(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}

