package io.keede.market.domains.product.service;

import io.keede.market.domains.product.entity.Product;
import io.keede.market.domains.product.entity.ProductRepository;
import io.keede.market.domains.product.service.ProductCommandService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class ProductServiceTests {

    @Mock
    private ProductRepository productRepository;

    private ProductCommandService sut;

    @BeforeEach
    void init() {
        this.sut = new ProductCommandService(
                this.productRepository
        );
    }

    @Test
    void 제품_등록() {

        Product entity = new Product(
                "냉장고",
                1000
        );

        given(this.productRepository.save(any()))
                .willReturn(entity);

        Product product = this.productRepository.save(
                entity
        );

        assertAll(
                () -> assertEquals(
                        product.getPrice(),
                        1000
                ),
                () -> assertEquals(
                        product.getName(),
                        "냉장고"
                )
        );
    }

}


