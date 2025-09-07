package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.ProductDetailDTO;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<ProductDetailDTO> getProductByCategory(String category) throws IOException;
}
