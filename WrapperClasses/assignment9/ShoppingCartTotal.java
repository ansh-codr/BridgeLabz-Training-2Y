package assignment9;

public class ShoppingCartTotal {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc"};
        int total = 0;
        for (String price : prices) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid:" + price);
            }
        }
        System.out.println(total);
    }
}
