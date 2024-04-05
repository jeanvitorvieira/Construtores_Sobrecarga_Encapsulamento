package entities;

import java.util.Date;

public class Order {
    private Date data;
    private Product product;

    public Order(Date data, Product product) {
        this.data = data;
        this.product = product;
        this.product.name = "TV";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
