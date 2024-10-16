package ir.jimsa.shoapp.ws.repository;

import ir.jimsa.shoapp.ws.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
