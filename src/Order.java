import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель" + " " + customer + " " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (customer != order.customer) return false;
        if (basket == null && order.basket == null) return true;
        if (basket != null && order.basket == null) return false;
        if (basket == null && order.basket != null) return false;
        if (basket.length != order.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != order.basket[i]) {
                return false;
            } else {
                Objects.equals(basket[i], order.basket[i]);
            }
        }
        return Objects.equals(customer, order.customer);
    }

}
