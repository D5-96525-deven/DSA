public class NthOccurrenceSearch {

    public static int findNthIndex(int[] arr, int key, int n) {
        if (arr == null || arr.length == 0 || n <= 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                
                if (count == n) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 5, 2, 5, 10};
        int target = 5;
        int n = 3;

        int result = findNthIndex(numbers, target, n);

        if (result != -1) {
            System.out.println("Index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}