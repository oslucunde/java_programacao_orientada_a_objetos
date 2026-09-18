package applicaton;

import entities.Product;
import entities.UsedProduct;
import entities.importedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used, or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'c') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                Product product = new Product(name, price);
                list.add(product);
            } else if (ch == 'u') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Product product = new importedProduct(name, price, customsFee);
                list.add(product);
            }

            System.out.println();
            System.out.println("PRICE TAGS: ");
            for (Product product: list) {
                System.out.println(product.priceTags());
            }
        }
        sc.close();
    }
}