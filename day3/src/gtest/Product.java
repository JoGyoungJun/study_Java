package gtest;

public class Product {
    private String name;

    public void sound(){
        System.out.println("딸깔따띾ㄹ");
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
