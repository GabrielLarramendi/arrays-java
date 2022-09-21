package entities;

public class TestClass {

    public String name;
    public double price;
    public int quantity;

    public TestClass(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "NOME: "
                + name
                + ", PREÇO: $ "
                + price
                + ", QUANTIDADE: "
                + quantity;
    }
}
