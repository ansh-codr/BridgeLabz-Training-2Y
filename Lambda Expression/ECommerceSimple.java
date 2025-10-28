package lambda_Expression;

import java.util.*;

public class ECommerceSortingSystem {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00, 4.5, 10.0));
        products.add(new Product("Phone", 800.00, 4.8, 15.0));
        products.add(new Product("Tablet", 400.00, 4.2, 20.0));
        products.add(new Product("Watch", 300.00, 4.6, 5.0));
        
        System.out.println("Original products:");
        products.forEach(System.out::println);
        
        // Sort by price using lambda
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by price:");
        products.forEach(System.out::println);
        
        // Sort by rating using lambda
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by rating:");
        products.forEach(System.out::println);
        
        // Sort by discount using lambda
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by discount:");
        products.forEach(System.out::println);
    }
}

class Product {
    String name;
    double price;
    double rating;
    double discount;
    
    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    
    @Override
    public String toString() {
        return name + " - Price: $" + price + ", Rating: " + rating + ", Discount: " + discount + "%";
    }
}