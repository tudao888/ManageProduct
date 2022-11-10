package BTMangerProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerProduct managerProduct = new ManagerProduct();
        while (true) {
            System.out.println("Quan ly product");
            System.out.println("1.Them");
            System.out.println("2.Sua");
            System.out.println("3.Xoa");
            System.out.println("4.Hien thi");
            System.out.println("5.Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product product = managerProduct.creatProduct();
                    managerProduct.add(product);
                    break;
                case 2:
                    System.out.println("Nhap vi tri muon sua: ");
                    int indexEdit = Integer.parseInt(scanner.nextLine());
                    Product productEdit = managerProduct.creatProduct();
                    managerProduct.edit(indexEdit,productEdit);
                    break;
                case 3:
                    System.out.println("Nhap vi tri muon xoa: ");
                    int indexDelete = Integer.parseInt(scanner.nextLine());
                    managerProduct.delete(indexDelete);
                    break;
                case 4:
                    managerProduct.show();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
    }
}