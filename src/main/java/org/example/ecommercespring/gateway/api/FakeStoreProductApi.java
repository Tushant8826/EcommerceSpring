package org.example.ecommercespring.gateway.api;

import org.example.ecommercespring.dto.FakeStoreProductDetailDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface FakeStoreProductApi {

    @GET("products")
    Call<List<FakeStoreProductDetailDTO>> getFakeStoreProductDetail(
            @Query("categorySlug") String category
    );
}
