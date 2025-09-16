package org.example.ecommercespring.gateway.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class OkHttpProductApi {

    private final OkHttpClient client;

    public OkHttpProductApi( OkHttpClient client ) {
        this.client = client;
    }


    public String getProductByCategory(String category) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.escuelajs.co/api/v1/products?categorySlug="+category) // Example URL
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }
}
