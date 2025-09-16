package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryDTO;
import org.example.ecommercespring.mappers.GetAllCategoryMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreCategoryRestTemplate")
public class FakeStoreCategoryRestTemplate implements CategoryGateway{

    private final RestTemplate restTemplate;

    public FakeStoreCategoryRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        String url = "https://api.escuelajs.co/api/v1/categories";

        ResponseEntity<FakeStoreCategoryDTO[]> response = restTemplate.getForEntity(url, FakeStoreCategoryDTO[].class);

        if(response.getBody() == null) {
            throw new IOException("Failed to fetch the categories from the fakestore server");
        }

        return GetAllCategoryMapper.toCategoryDTO(response.getBody());
    }
}
