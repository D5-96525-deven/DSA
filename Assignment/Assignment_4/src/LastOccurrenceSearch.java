public class LastOccurrenceSearch {

    public static int findLastIndex(int[] arr, int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 30, 50};
        int target = 30;

        int result = findLastIndex(numbers, target);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}
