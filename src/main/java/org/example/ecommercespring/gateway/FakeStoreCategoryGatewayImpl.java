package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryDTO;
import org.example.ecommercespring.gateway.api.FakeStoreCategoryApi;
import org.example.ecommercespring.mappers.GetAllCategoryMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGatewayImpl implements  CategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGatewayImpl(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryDTO[] response = fakeStoreCategoryApi.getAllCategories().execute().body();

        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }

        return GetAllCategoryMapper.toCategoryDTO(response);
    }
}
