public class InsertionSortDescending {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSortDescending(arr);

        System.out.println("Sorted array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSortDescending(int[] arr) {
        // Traverse from 1 to arr.length
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are less than key,
            // to one position ahead of their current position
            while (j >= 0 && key > arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }
}