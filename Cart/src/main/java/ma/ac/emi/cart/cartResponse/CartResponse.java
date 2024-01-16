package ma.ac.emi.cart.cartResponse;

import org.springframework.web.bind.annotation.PathVariable;

public class CartResponse {
    Long userId;
    Long productId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public CartResponse(Long userId, Long productId) {
        this.userId = userId;
        this.productId = productId;
    }
}
