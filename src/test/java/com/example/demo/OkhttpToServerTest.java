package com.example.demo;

import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OkhttpToServerTest {
    @Test
    void hello() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(HttpUrl.get("http://localhost/functional/mono"))
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        assertEquals(200, response.code());
    }
}
