package pertemuan_1;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1, 3};

        System.out.println("Data sebelum diurutkan: ");
        printData(data);

        bubbleSort(data);

        System.out.println("\nData setelah diurutkan: ");
        printData(data);
    }

    public static void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // swap data[j] dengan data[j+1]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void printData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
