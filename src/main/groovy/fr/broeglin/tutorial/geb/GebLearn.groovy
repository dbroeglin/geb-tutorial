package fr.broeglin.tutorial.geb 

import geb.Browser

class GebTutorial {

    static void firstExample() {

        Browser.drive() {
	    go "http://google.com/ncr"
            assert title == "Google"

            // enter wikipedia into the search field
            $("input", name: "q").value("wikipedia")

            // wait for the change to results page to happen
            // (google updates the page without a new request)
            waitFor { title.endsWith("Google Search") }

            // is the first link to wikipedia?
            def firstLink = $("h3.r", 0).find("a")
            assert firstLink.text() == "Wikipedia"

            // click the link
            firstLink.click()

            // wait for Google's javascript to redirect
            // us to Wikipedia
            waitFor { title == "Wikipedia" }

	    println "We are now on page: " + title
        }

    }
}
