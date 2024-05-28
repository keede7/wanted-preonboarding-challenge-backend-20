package io.keede.market.domains.product.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_t")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    private String name;

    private long price;

    private ReservationStatus reservationStatus;

    protected Product() {}

    public Product(
            final String name,
            final long price
    ) {
        this.name = name;
        this.price = price;
        this.reservationStatus = ReservationStatus.FOR_SALE;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

}
