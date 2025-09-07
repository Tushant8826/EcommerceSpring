package org.example.ecommercespring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductDetailDTO {
    private String id;
    private String title;
    private String price;
    private String description;
    private String slug;
    private List<String> images;
}
