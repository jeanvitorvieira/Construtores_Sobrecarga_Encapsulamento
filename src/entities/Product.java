package entities;

public class Product {
    //private = encapsulamento dos atributos = própria classe
    //nada = mesmo pacote
    //protected = mesmo pacote/subclasses de pacotes diferentes
    //public = todas as classes
    String name;
    private double price;
    private int quantity;

    // Alt + Fn + Insert = construtores, getters e setters automáticos
    //construtor padrão
    public Product() {
    }

    //construtor para receber dados na hora // obrigatoriedade
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga de construtor para quando quantity == 0
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getName para retornar o parâmetro
    public String getName() {
        return name;
    }

    //setName para atribuição
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}