package org.example.ecommercespring.gateway;

import org.example.ecommercespring.dto.ProductDetailDTO;

import java.io.IOException;
import java.util.List;

public interface ProductGateway {

    List<ProductDetailDTO> getProductByCategory(String category) throws IOException;
}
