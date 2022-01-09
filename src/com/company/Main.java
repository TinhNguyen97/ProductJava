package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Apple", 1000, "táo");
        Product product2 = new Product(2, "Samsung", 800, "sung");
        Product product3 = new Product(3, "LG  ", 600, "eogi");
        Product product4 = new Product(4, "Vertu", 2000, "vơtu");
        Product product5 = new Product(5, "Nokia", 300, "nôkia");
        Product product[] = {product1, product2, product3, product4, product5};
        System.out.println("Danh sách các sản phẩm:");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i].displayProduct());
        }
        System.out.println("Selection:");
        System.out.println("1.Thêm một sản phẩm.");
        System.out.println("2.Xóa một sản phẩm.");
        System.out.println("3.Tìm kiếm một sản phẩm theo tên.");
        System.out.println("4.Sắp xếp các sản phẩm theo thứ tự A->Z");
        Scanner scanner = new Scanner(System.in);
        int choice;
        int index;
        do {
            System.out.print("Your selection:");
            choice = scanner.nextInt();
            if (choice < 0 || choice > 5) {
                System.out.println("Xin hãy chọn lựa chọn phù hợp");
            }
        }
        while (choice < 0 || choice > 5);
        switch (choice) {
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                Scanner scanner2 = new Scanner(System.in);
                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Nhập tên sản phẩm mới: ");
                String newName = scanner1.nextLine();
                System.out.print("Nhập giá sản phẩm mới: ");
                int newPrice = scanner2.nextInt();
                System.out.print("Nhập mô tả sản phẩm mới: ");
                String newDescripition = scanner3.nextLine();
                Product product6 = new Product(6, newName, newPrice, newDescripition);
                Product newProduct[] = new Product[6];
                for (int j = 0; j < product.length; j++) {
                    newProduct[j] = product[j];
                }
                newProduct[5] = product6;
                System.out.println("Danh sách các sản phẩm mới là: ");
                displayNewArr(newProduct);
            case 2:
                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Nhập vị trí cần xóa: ");
                index = scanner4.nextInt();
                Product arr[] = removeElementFromArray(product, index-1);
                displayNewArr(arr);

        }
    }

    public static void displayNewArr(Product arr[]) {
        for (int z = 0; z < arr.length; z++) {
            System.out.println(arr[z].displayProduct());
        }
    }

    public static Product[] removeElementFromArray(Product[] array, int index) {
        Product[] newArray = new Product[array.length - 1];
        for (int a = 0; a < newArray.length; a++) {
            if (a < index) {
                newArray[a] = array[a];
            } else {
                newArray[a] = array[a + 1];
            }
        }
        return newArray;
    }
}
