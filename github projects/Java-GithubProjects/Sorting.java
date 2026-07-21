import java.util.Arrays;

class Sorting {
    // Bubble Sort
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 6};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        System.out.println("Original Array: " + Arrays.toString(arr1));

        bubbleSort(arr1);
        System.out.println("Bubble Sort: " + Arrays.toString(arr1));

        selectionSort(arr2);
        System.out.println("Selection Sort: " + Arrays.toString(arr2));

        insertionSort(arr3);
        System.out.println("Insertion Sort: " + Arrays.toString(arr3));
    }
}
