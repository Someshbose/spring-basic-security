package someshbose.github.io.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "SP_PRODUCT")
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
