/* https://www.geeksforgeeks.org/find-index-first-1-sorted-array-0s-1s/
 * Given a sorted array consisting 0’s and 1’s. The problem is to find
 * the index of first ‘1’ in the sorted array. It could be possible that
 * the array consists of only 0’s or only 1’s. If 1’s are not present in
 * the array then print “-1”.
 * Created by Abhijeet Singh
 * www.absingh.com
 */

package search;

public class BinarySearch {
    int indexOfFirstOne(int arr[], int low, int high) {
        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0))
                return mid;
            else if(arr[mid] == 1)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    // driver function to test
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(bs.indexOfFirstOne(arr, 0, arr.length - 1));
    }
}
