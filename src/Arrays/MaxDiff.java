package Arrays;

public class MaxDiff {

//    Time Complexity is O(n^2)
    public static int maxDiff(int arr[], int n) {

        int max = arr[1] - arr[0];

        for(int i=0;i<n;i++) {
            for(int j= i + 1;j<n;j++) {
                if(arr[j] - arr[i] > max) {
                    max = arr[j] - arr[i];
                }
            }
        }

        return max;

    }

    public static int maxDiff2(int arr[], int n) {

        int max = arr[1] - arr[0];
        int minEle = arr[0];

        for(int i=1;i<n;i++) {

            if(arr[i] - minEle > max) {
                max = arr[i] - minEle;
            }
            if(arr[i] < minEle) {
                minEle = arr[i];
            }

        }

        return max;

    }

    public static void main(String[] args)
    {

        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum difference is " +
                maxDiff2(arr, 5));
    }
}
