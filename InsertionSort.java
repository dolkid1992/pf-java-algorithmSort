public class InsertionSort {
    static int[] list = {2, 6, 3, 7, 3, -1, 5, 29, 17, 21, 5, 14, 33, 42, 66, 99, 66, 54};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        }
}

