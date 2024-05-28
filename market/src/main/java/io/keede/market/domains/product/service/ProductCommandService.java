package io.keede.market.domains.product.service;

import io.keede.market.domains.product.entity.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCommandService {

    private final ProductRepository productRepository;

    public ProductCommandService(
            final ProductRepository productRepository
    ) {
        this.productRepository = productRepository;
    }
}
