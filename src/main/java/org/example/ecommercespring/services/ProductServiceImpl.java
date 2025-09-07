package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.ProductDetailDTO;
import org.example.ecommercespring.gateway.ProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    ProductGateway productGateway;

    public ProductServiceImpl(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public List<ProductDetailDTO> getProductByCategory(String category) throws IOException {
        return productGateway.getProductByCategory(category);
    }
}
