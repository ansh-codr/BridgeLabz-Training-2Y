import java.util.*;import java.util.*;import java.util.*;



public class ECommerceSortingSystem {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();public class ECommerceSortingSystem {public class ECommerceSortingSystem {

        products.add(new Product("Laptop", 1200.00, 4.5, 10.0, "Electronics", 89));

        products.add(new Product("Phone", 800.00, 4.8, 15.0, "Electronics", 150));    public static void main(String[] args) {    public static void main(String[] args) {

        products.add(new Product("Tablet", 400.00, 4.2, 20.0, "Electronics", 95));

        products.add(new Product("Watch", 300.00, 4.6, 5.0, "Electronics", 120));        List<Product> products = new ArrayList<>();        List<Product> products = new ArrayList<>();

        

        System.out.println("Original products:");        products.add(new Product("Laptop", 1200.00, 4.5, 10.0, "Electronics", 89));        products.add(new Product("Laptop", 1200.00, 4.5, 10.0, "Electronics", 89));

        products.forEach(System.out::println);

                products.add(new Product("Phone", 800.00, 4.8, 15.0, "Electronics", 150));        products.add(new Product("Phone", 800.00, 4.8, 15.0, "Electronics", 150));

        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        System.out.println("\nSorted by price:");        products.add(new Product("Tablet", 400.00, 4.2, 20.0, "Electronics", 95));        products.add(new Product("Tablet", 400.00, 4.2, 20.0, "Electronics", 95));

        products.forEach(System.out::println);

                products.add(new Product("Watch", 300.00, 4.6, 5.0, "Electronics", 120));        products.add(new Product("Watch", 300.00, 4.6, 5.0, "Electronics", 120));

        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));

        System.out.println("\nSorted by rating:");                

        products.forEach(System.out::println);

                System.out.println("Original products:");        System.out.println("Original products:");

        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));

        System.out.println("\nSorted by discount:");        products.forEach(System.out::println);        products.forEach(System.out::println);

        products.forEach(System.out::println);

    }                

}
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        System.out.println("\nSorted by price:");        System.out.println("\nSorted by price:");

        products.forEach(System.out::println);        products.forEach(System.out::println);

                

        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));

        System.out.println("\nSorted by rating:");        System.out.println("\nSorted by rating:");

        products.forEach(System.out::println);        products.forEach(System.out::println);

                

        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));

        System.out.println("\nSorted by discount:");        System.out.println("\nSorted by discount:");

        products.forEach(System.out::println);        products.forEach(System.out::println);

    }    }

}}
}
    
    // Sort by sales count - best sellers first
    public void sortBySalesCount() {
        System.out.println("\n🔥 SORTING BY SALES COUNT (Best Sellers First) 🔥");
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getSalesCount(), p1.getSalesCount()))
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Custom sorting for Black Friday campaign (high discount + good rating)
    public void blackFridaySort() {
        System.out.println("\n🛍️ BLACK FRIDAY SPECIAL SORTING 🛍️");
        System.out.println("(Prioritizing high discount + good rating)");
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> {
                    // Create a composite score: discount weight 60%, rating weight 40%
                    double score1 = (p1.getDiscount() * 0.6) + (p1.getRating() * 8); // rating scaled to match discount range
                    double score2 = (p2.getDiscount() * 0.6) + (p2.getRating() * 8);
                    return Double.compare(score2, score1); // Higher score first
                })
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Premium campaign sorting (rating + price consideration)
    public void premiumCampaignSort() {
        System.out.println("\n💎 PREMIUM CAMPAIGN SORTING 💎");
        System.out.println("(High rating products, expensive items first)");
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> {
                    // First sort by rating (high to low), then by price (high to low)
                    int ratingCompare = Double.compare(p2.getRating(), p1.getRating());
                    if (ratingCompare != 0) {
                        return ratingCompare;
                    }
                    return Double.compare(p2.getPrice(), p1.getPrice());
                })
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Budget-friendly campaign sorting
    public void budgetFriendlySort() {
        System.out.println("\n💰 BUDGET-FRIENDLY CAMPAIGN SORTING 💰");
        System.out.println("(Best value: low discounted price + good rating)");
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> {
                    // Create value score: lower discounted price is better, higher rating is better
                    double valueScore1 = p1.getRating() / p1.getDiscountedPrice() * 1000; // Scale for readability
                    double valueScore2 = p2.getRating() / p2.getDiscountedPrice() * 1000;
                    return Double.compare(valueScore2, valueScore1); // Higher value score first
                })
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Trending products sorting (sales + rating)
    public void trendingProductsSort() {
        System.out.println("\n📈 TRENDING PRODUCTS SORTING 📈");
        System.out.println("(High sales count + good rating)");
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> {
                    // Composite score: sales count weight 70%, rating weight 30%
                    double trendScore1 = (p1.getSalesCount() * 0.7) + (p1.getRating() * 30);
                    double trendScore2 = (p2.getSalesCount() * 0.7) + (p2.getRating() * 30);
                    return Double.compare(trendScore2, trendScore1);
                })
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Multi-criteria sorting with custom lambda
    public void customMultiCriteriaSort() {
        System.out.println("\n🎯 CUSTOM MULTI-CRITERIA SORTING 🎯");
        System.out.println("(1st: Rating > 4.0, 2nd: Discount > 15%, 3rd: Price ascending)");
        
        Comparator<Product> customComparator = (p1, p2) -> {
            // First priority: Rating above 4.0
            boolean p1HighRating = p1.getRating() > 4.0;
            boolean p2HighRating = p2.getRating() > 4.0;
            
            if (p1HighRating != p2HighRating) {
                return p1HighRating ? -1 : 1; // High rating products first
            }
            
            // Second priority: Discount above 15%
            boolean p1HighDiscount = p1.getDiscount() > 15.0;
            boolean p2HighDiscount = p2.getDiscount() > 15.0;
            
            if (p1HighDiscount != p2HighDiscount) {
                return p1HighDiscount ? -1 : 1; // High discount products first
            }
            
            // Third priority: Price ascending
            return Double.compare(p1.getPrice(), p2.getPrice());
        };
        
        List<Product> sorted = products.stream()
                .sorted(customComparator)
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Dynamic sorting based on campaign type
    public void dynamicSort(String campaignType) {
        System.out.println("\n🔄 DYNAMIC SORTING - Campaign: " + campaignType.toUpperCase() + " 🔄");
        
        Comparator<Product> campaignComparator;
        
        switch (campaignType.toLowerCase()) {
            case "price":
                campaignComparator = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
                break;
            case "rating":
                campaignComparator = (p1, p2) -> Double.compare(p2.getRating(), p1.getRating());
                break;
            case "discount":
                campaignComparator = (p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount());
                break;
            case "bestseller":
                campaignComparator = (p1, p2) -> Integer.compare(p2.getSalesCount(), p1.getSalesCount());
                break;
            case "savings":
                campaignComparator = (p1, p2) -> Double.compare(p2.getSavings(), p1.getSavings());
                break;
            default:
                campaignComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
                System.out.println("Unknown campaign type. Sorting alphabetically by name.");
        }
        
        List<Product> sorted = products.stream()
                .sorted(campaignComparator)
                .collect(Collectors.toList());
        displayProducts(sorted);
    }
    
    // Helper method to display products
    private void displayProducts(List<Product> productList) {
        System.out.println("─".repeat(120));
        System.out.printf("%-20s | %-10s | %-9s | %-11s | %-14s | %-6s%n", 
                "Product Name", "Price", "Rating", "Discount", "Final Price", "Sales");
        System.out.println("─".repeat(120));
        productList.forEach(System.out::println);
        System.out.println("─".repeat(120));
    }
    
    // Main method to demonstrate all sorting strategies
    public static void main(String[] args) {
        ECommerceSortingSystem sortingSystem = new ECommerceSortingSystem();
        
        System.out.println("🛒 E-COMMERCE CUSTOM SORTING SYSTEM 🛒");
        System.out.println("Using Lambda Expressions with Comparator for Dynamic Sorting");
        System.out.println("═".repeat(120));
        
        // Basic sorting demonstrations
        sortingSystem.sortByPriceAscending();
        sortingSystem.sortByPriceDescending();
        sortingSystem.sortByDiscountedPrice();
        sortingSystem.sortByRating();
        sortingSystem.sortByDiscount();
        sortingSystem.sortBySalesCount();
        
        // Campaign-specific sorting
        sortingSystem.blackFridaySort();
        sortingSystem.premiumCampaignSort();
        sortingSystem.budgetFriendlySort();
        sortingSystem.trendingProductsSort();
        sortingSystem.customMultiCriteriaSort();
        
        // Dynamic sorting examples
        sortingSystem.dynamicSort("price");
        sortingSystem.dynamicSort("rating");
        sortingSystem.dynamicSort("discount");
        sortingSystem.dynamicSort("bestseller");
        sortingSystem.dynamicSort("savings");
        sortingSystem.dynamicSort("unknown");
        
        // Demonstrate chained comparators
        System.out.println("\n🔗 CHAINED COMPARATORS EXAMPLE 🔗");
        System.out.println("(Rating desc → Discount desc → Price asc)");
        List<Product> chainSorted = sortingSystem.products.stream()
                .sorted(Comparator.comparing(Product::getRating).reversed()
                        .thenComparing(Comparator.comparing(Product::getDiscount).reversed())
                        .thenComparing(Product::getPrice))
                .collect(Collectors.toList());
        sortingSystem.displayProducts(chainSorted);
    }
}