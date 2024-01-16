package ma.ac.emi.cart.Service;

import ma.ac.emi.cart.dto.CartDTO;
import ma.ac.emi.cart.entity.Cart;
import ma.ac.emi.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class CartService {
    private final CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart createCart(CartDTO cartDTO) {
        return cartRepository.save(new Cart(cartDTO.getUserId(),cartDTO.getProductIds()));
    }

    public Cart getAllCartsByUserId(Long userId) {
        return cartRepository.findAllByUserId(userId).get();
    }

    public void deleteCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }
    public Cart addProductId(Long userId, Long productId) {
        Cart cart = null;
        if(!cartRepository.findAllByUserId(userId).isPresent()){
            cart = new Cart(userId,new ArrayList<>());
        }
        else {
            cart = cartRepository.findAllByUserId(userId).get();
        }
        List<Long> productIds = cart.getProductIds();
        cart.addProductToCart(productId);
        return cartRepository.save(cart);
    }

    public Cart removeProductId(Long cartId, Long productId) {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(()-> new RuntimeException("cart not found!"));
        List<Long> productIds = cart.getProductIds();
        productIds.remove(productIds);
        return cartRepository.save(cart);
    }
}

