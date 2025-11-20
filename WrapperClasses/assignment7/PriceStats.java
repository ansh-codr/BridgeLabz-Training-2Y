package assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriceStats {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        List<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);
        }
        double sum = 0.0;
        for (double value : priceList) {
            sum += value;
        }
        System.out.println(Collections.max(priceList));
        System.out.println(sum / priceList.size());
    }
}
