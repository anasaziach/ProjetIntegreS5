package ma.ac.emi.cart.repository;

import ma.ac.emi.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findAllByUserId(Long userId);

}
