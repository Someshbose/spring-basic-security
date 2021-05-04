package someshbose.github.io.springsecurity.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "SP_PRODUCT")
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    // Omitted code
}
