package com.rapidapi.services.testCases.football;

import com.rapidapi.services.utilities.getRequests;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;

import java.io.IOException;


public class TestCase_GetContriesSeasons extends getRequests {

    private Logger log = Logger.getLogger(TestCase_GetTeams.class);

    @Test
    void getSeasons() throws IOException {

        // BasicConfigurator.configure();

        new getRequests().getRequest(seasonsEndpoint,apiKey);
        System.out.println("This is Seasons Test\n");
        //LOG.error("Error occurred while executing test case with error " + e.getMessage());

        log.info("Start of setUp");
    }

    @Test

    void getCountries ()throws IOException {

        // BasicConfigurator.configure();

        new getRequests().getRequest(countriesEndpoint,apiKey);
        System.out.println("This is Countries Test\n");
        //LOG.error("Error occurred while executing test case with error " + e.getMessage());

        log.info("End of countries Testcase");
    }


}
