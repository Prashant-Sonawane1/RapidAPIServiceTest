package com.rapidapi.services.utilities;

import com.rapidapi.services.config.constants;
import com.squareup.okhttp.*;

import java.io.IOException;

public class postRequests extends constants {



    public void postRequest(String endPoint, String keyToken, String host, String payloadContent) throws IOException {


        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, payloadContent);
        Request request = new Request.Builder()
                .url(endPoint)
                .post(body)
                .addHeader("content-type", "application/x-www-form-urlencoded")
                .addHeader("x-rapidapi-key", keyToken)
                .addHeader("x-rapidapi-host", host)
                .build();

        Response response = client.newCall(request).execute();
    }
}

