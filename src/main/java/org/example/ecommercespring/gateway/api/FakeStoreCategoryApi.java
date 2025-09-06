package org.example.ecommercespring.gateway.api;

import org.example.ecommercespring.dto.FakeStoreCategoryDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;

public interface FakeStoreCategoryApi {

    @GET("categories")
    Call<List<FakeStoreCategoryDTO>> getAllCategories() throws IOException;

}
