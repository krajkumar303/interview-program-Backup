
public class StockPurchase {

  public static void main(String[] args) {
    int[] prices = { 200, 150, 170, 90, 80, 150, 180, 10, 20, 30, 50, 100 };
    int minPrice = prices[0];
    int maxPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      } else {
        maxPrice = prices[i];
      }
      maxPrice = Math.max(maxPrice, prices[i]);
    }
    System.out.println(minPrice);
    System.out.println(maxPrice);
  }

}
