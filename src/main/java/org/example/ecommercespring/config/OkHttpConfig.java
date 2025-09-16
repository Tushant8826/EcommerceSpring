package org.example.ecommercespring.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class OkHttpConfig {

    @Bean
    public OkHttpClient okHttpClient() {
        // Optional: Logging interceptor for debugging

        return new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)   // connection timeout
                .readTimeout(30, TimeUnit.SECONDS)      // server response timeout
                .writeTimeout(15, TimeUnit.SECONDS)     // request body write timeout
                .build();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
