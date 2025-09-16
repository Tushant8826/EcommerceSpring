package org.example.ecommercespring.mappers;

import org.example.ecommercespring.dto.CategoryDTO;
import org.example.ecommercespring.dto.FakeStoreCategoryDTO;

import java.util.Arrays;
import java.util.List;

public class GetAllCategoryMapper {

    public static List<CategoryDTO> toCategoryDTO(FakeStoreCategoryDTO[] response) {
        return Arrays.stream(response)
                .map(item -> CategoryDTO
                        .builder()
                        .type(item.getName())
                        .build()
                ).toList();
    }
}
