package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.FakeStoreProductDetailDTO;
import org.example.ecommercespring.dto.ProductDetailDTO;
import org.example.ecommercespring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class ProductGatewayImpl implements ProductGateway{

    FakeStoreProductApi fakeStoreProductApi;

    public ProductGatewayImpl(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public List<ProductDetailDTO> getProductByCategory(String category) throws IOException {

        List<FakeStoreProductDetailDTO> response = fakeStoreProductApi.getFakeStoreProductDetail(category).execute().body();

        if (response == null) {
            throw new IOException("Failed to fetch product details from FakeStore API");
        }

        return response.stream().map(item ->
                ProductDetailDTO.builder().id(item.getId())
                        .price(item.getPrice())
                        .title(item.getTitle())
                        .description(item.getDescription())
                        .build()
        ).toList();
    }
}
