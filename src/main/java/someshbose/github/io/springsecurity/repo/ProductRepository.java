package someshbose.github.io.springsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import someshbose.github.io.springsecurity.model.Product;

public interface ProductRepository
        extends JpaRepository<Product, Integer> {
}
