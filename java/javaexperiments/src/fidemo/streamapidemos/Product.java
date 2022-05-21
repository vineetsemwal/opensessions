package fidemo.streamapidemos;

public class Product {
    private String name;
    private String type;
    private double price;

    public Product(String name, String category,double price){
        this.name = name;
        this.price=price;
        this.type=category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
