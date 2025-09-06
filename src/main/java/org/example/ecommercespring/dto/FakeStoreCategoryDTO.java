package org.example.ecommercespring.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreCategoryDTO {
    private String id;
    private String name;
    private String slug;
    private String image;
}
