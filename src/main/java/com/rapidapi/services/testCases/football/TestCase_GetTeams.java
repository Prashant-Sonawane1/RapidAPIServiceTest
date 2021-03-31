package com.rapidapi.services.testCases.football;

import com.rapidapi.services.utilities.getRequests;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;

import java.io.IOException;


public class TestCase_GetTeams extends getRequests {

    private Logger log = Logger.getLogger(TestCase_GetTeams.class);

    @Test
   // @Parameters("teamId")
    void getTeamByID() throws IOException {

        // BasicConfigurator.configure();

        new getRequests().getRequest(teamsIDEndpoint,apiKey);
        System.out.println("This is setup Test\n");
        //LOG.error("Error occurred while executing test case with error " + e.getMessage());

        log.info("Start of setUp");
    }

    @Test

    void getTeamByLeagueId ()throws IOException {

        // BasicConfigurator.configure();

        new getRequests().getRequest(leagueEndpoint,apiKey);
        System.out.println("This is setup Test\n");
        //LOG.error("Error occurred while executing test case with error " + e.getMessage());

        log.info("Start of setUp");
    }


}
