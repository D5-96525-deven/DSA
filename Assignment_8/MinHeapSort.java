public class MinHeapSort {

    void heapSort(int arr[]) {

        int n = arr.length;

        buildMinHeap(arr, n);

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            minHeapify(arr, i, 0);
        }
    }

    void buildMinHeap(int arr[], int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(arr, n, i);
        }
    }

    void minHeapify(int arr[], int n, int i) {

        int smallest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            minHeapify(arr, n, smallest);
        }
    }

    void printArray(int arr[]) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MinHeapSort obj = new MinHeapSort();

        int arr[] = {40, 10, 30, 50, 20};

        obj.heapSort(arr);

        System.out.println("Sorted Array:");

        obj.printArray(arr);
    }
}