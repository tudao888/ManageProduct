package BTMangerProduct;

import java.util.Scanner;

public class ManagerProduct {
    Product[] products = new Product[0];

    public void show() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
    }

    public void add(Product product) {
        Product[] newArr = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newArr[i] = products[i];
        }
        newArr[newArr.length - 1] = product;
        products = newArr;
    }

    public Product creatProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap name cua san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap img cua san pham");
        String img = scanner.nextLine();
        System.out.println("Nhap gia cua san pham");
        double price = scanner.nextDouble();
        Product product = new Product(name, price, img);
        return product;
    }

    public void edit(int index, Product product) {
        if (index >= 0 && index < products.length) {
            products[index] = product;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < products.length) {
            Product[] newArr = new Product[products.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = products[i];
                } else {
                    newArr[i] = products[i + 1];
                }
            }
            products = newArr;
        }
    }
}
