public class TrurlBank {

    public int sumQuads(int n) {

        int result = 0;
        while (n > 0) {
            result += (int) Math.pow(n, 2);
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
//        System.out.println(Math.pow(4, 2));
    }
}