/**
 * Product class representing an e-commerce product
 */
public class Product {
    private String name;
    private double price;
    private double rating; // 1.0 to 5.0
    private double discount; // percentage 0-100
    private String category;
    private int salesCount;
    
    public Product(String name, double price, double rating, double discount, String category, int salesCount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
        this.category = category;
        this.salesCount = salesCount;
    }
    
    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public double getDiscount() { return discount; }
    public String getCategory() { return category; }
    public int getSalesCount() { return salesCount; }
    
    // Calculate discounted price
    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }
    
    // Calculate savings
    public double getSavings() {
        return price * discount / 100;
    }
    
    @Override
    public String toString() {
        return String.format("%-20s | $%-8.2f | Rating: %.1f | Discount: %5.1f%% | Discounted: $%-8.2f | Sales: %d",
                name, price, rating, discount, getDiscountedPrice(), salesCount);
    }
}