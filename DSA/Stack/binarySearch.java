public class binarySearch{

    public static int binarySearchExample(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 7;

        System.out.println(binarySearchExample(arr, target));
    }
}