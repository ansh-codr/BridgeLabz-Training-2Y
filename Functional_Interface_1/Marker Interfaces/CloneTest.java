public class CloneTest {
    public static void main(String[] args) {
        Product original = new Product("Laptop", 1000.0);
        Product copy = (Product) original.clone();
        
        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
    }
}