package com.rapidapi.services.utilities;

import com.rapidapi.services.config.constants;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class getRequests extends constants {


    public void getRequest(String endPoint, String keyToken) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(endPoint)
                .get()
                .addHeader("x-rapidapi-key",keyToken)
                .addHeader("x-rapidapi-host", "api-football-v1.p.rapidapi.com")
                .build();
        System.out.println("Hello");

        Response response = null;

            response = client.newCall(request).execute();

        System.out.print(response.code());

        System.out.print("\n");

        System.out.print(response.body().string());




    }
}

