package pro.sky.oldcourse2.lesson9;

import java.util.Objects;

public class Product {
    private final String name;
    private Double price;
    private Double amount;

    protected Product(String name, Double price, Double amount) {
        if (name == null || name.trim().isEmpty()) {
            throw new RuntimeException("Заполните карточку товара: " + getName());
        } else {
            this.name = name;
        }
        this.price = setPrice(price);
        this.amount = setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAmount() {
        return amount;
    }

    public Double setPrice(Double price) {
        if (price == null || price <= 0) {
            throw new FieldsConstructorEmpty("Заполните карточку товара полностью: " + getName());
        } else {
            this.price = price;
        }
        return price;
    }

    public Double setAmount(Double amount) {
        if (amount == null || amount <= 0) {
            throw new FieldsConstructorEmpty("Заполните карточку товара полностью: " + getName());
        } else {
            this.amount = amount;
        }
        return amount;
    }

    @Override
    public String toString() {
        return getName() + ", цена: " + getPrice() + " рублей, " + getAmount() + " кг.\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price)
                && Objects.equals(amount, product.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount);
    }

}
