package someshbose.github.io.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import someshbose.github.io.springsecurity.model.Product;
import someshbose.github.io.springsecurity.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
