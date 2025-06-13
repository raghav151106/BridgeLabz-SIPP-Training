package Day01_ProgrammingElements;

public class ProfitLoss {
    public static void main(String[] args) {
        float CostPrice = 129;
        float SellingPrice=191;
        float profit= SellingPrice - CostPrice;
        float profitPercent=(profit / CostPrice) *100;
        System.out.println("The Cost Price is INR "+CostPrice+" and Selling Price is INR "+ SellingPrice  +"\n"+" The Profit is INR "+profit+" and the Profit Percentage is "+profitPercent);
    }
}
