package org.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreCategoryDTO{
	private String image;
	private String name;
	private Integer id;
	private String slug;
}
