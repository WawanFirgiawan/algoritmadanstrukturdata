package pertemuan_1;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 1773;

        int[] result = getChange(coins, amount);

        System.out.println("Jumlah kembalian yang diberikan adalah: ");
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(result[i] + " x " + coins[i] + " sen");
            }
        }
    }

    public static int[] getChange(int[] coins, int amount) {
        int[] result = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                result[i]++;
                amount -= coins[i];
            }
        }

        return result;
    }
}
