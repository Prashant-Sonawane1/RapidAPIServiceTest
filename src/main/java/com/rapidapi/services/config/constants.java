package com.rapidapi.services.config;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


public class constants {


    public String apiKey = "b6031ba2bcmsh6a4d56369a56bb5p17cb66jsnca577790d09b";

    public String footballBaseUrl = "https://api-football-v1.p.rapidapi.com/v2/";

    public String seasonsEndpoint = footballBaseUrl + "/seasons";
    public String countriesEndpoint = footballBaseUrl + "/countries";
    public String teamsIDEndpoint = footballBaseUrl + "/teams/team";
    public String leagueEndpoint = footballBaseUrl + "/league/2";



    public String foodNutritionBaseUrl = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/";
    public String foodNutritionHost = "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com";

    public String cuisineEndpoint = foodNutritionBaseUrl + "/cuisine";
    //public String countriesEndpoint = foodNutritionBaseUrl + "/countries";


}
