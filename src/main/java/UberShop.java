import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5f;
            }
        }
    }

    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);

        //Should be [200, 2250]
        float[] prices1 = new float[] {100f, 1500f};
        shop.multiplyPrices(prices1);
        System.out.println(Arrays.toString(prices1));

    }
}