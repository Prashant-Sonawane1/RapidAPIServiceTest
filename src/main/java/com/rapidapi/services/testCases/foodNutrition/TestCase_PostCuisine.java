package com.rapidapi.services.testCases.foodNutrition;

import com.rapidapi.services.testCases.football.TestCase_GetTeams;
import com.rapidapi.services.utilities.getRequests;
import com.rapidapi.services.utilities.postRequests;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestCase_PostCuisine extends postRequests {

    private Logger log = Logger.getLogger(TestCase_GetTeams.class);

    @Test
    void postCuisine() throws IOException {

        // BasicConfigurator.configure();

        String postCuisinePayload = "ingredientList=3%20oz%20pork%20shoulder&title=Pork%20roast%20with%20green%20beans";

        new postRequests().postRequest(cuisineEndpoint,apiKey,foodNutritionHost,postCuisinePayload);
        System.out.println("This is Seasons Test\n");
        //LOG.error("Error occurred while executing test case with error " + e.getMessage());

        log.info("Start of TestCase PostCuisine");
    }


}
