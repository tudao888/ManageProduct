package BTMangerProduct;

public class Product {
    private String name;
    private double price;
    private String  img;

    public Product() {
    }

    public Product(String name, double price, String img) {
        this.name = name;
        this.price = price;
        this.img = img;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", img='" + img + '\'' +
                '}';
    }
}
