package pertemuan_1;

public class LinearSearch {

    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1, 3};
        int key = 4;

        int index = linearSearch(data, key);

        if (index != -1) {
            System.out.println("Data ditemukan di indeks: " + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static int linearSearch(int[] data, int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i; // data ditemukan
            }
        }
        return -1; // data tidak ditemukan
    }
}

