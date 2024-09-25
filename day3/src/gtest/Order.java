package gtest;

public class Order<T> {
    private final int price;
    private final T data;

    public T getData() {
        return data;
    }

    public Order(int price, T data) {
        this.price = price;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", data=" + data +
                '}';
    }
}
