package Level1;
/*Problem:
Calculate the profit and profit percentage based on:
	•	Cost Price (CP) = INR 129
	•	Selling Price (SP) = INR 191

Formula:
Profit = SP – CP
Profit Percentage = (Profit ÷ CP) × 100
	•	Input: None
	•	Output (Multi-line): 
    */
public class ProfitAndPercentage {
    public static void main(String[] args){
        int CP = 129;
        int SP = 191;
        int profit = SP - CP;
        int profitPercentage = (profit / CP) * 100;
        System.out.println("Profit: " + profit);
        System.out.println("Profit Percentage: " + profitPercentage);
    }
}
