public class DescendingBinarySearch {

    public static int binarySearch(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {100, 85, 70, 55, 40, 25, 10};
        int target = 40;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}