// Level2 - Program 5: Shopping Cart Item
public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addQuantity(int qty) {
        if (qty > 0) quantity += qty;
    }

    public void removeQuantity(int qty) {
        if (qty > 0) quantity = Math.max(0, quantity - qty);
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayTotal() {
        System.out.println("Cart Item: " + itemName + ", Qty: " + quantity + ", Unit Price: " + price + ", Total: " + getTotalCost());
    }
}