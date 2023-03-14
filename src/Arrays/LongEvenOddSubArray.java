package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LongEvenOddSubArray {

//    Time Complexity is O(n^2)
//    Auxillary space is O(1)
    public static int longestEvenOddSubarray(int arr[], int n) {
        int ans = 1;

        for(int i=0;i<n;i++)  {
            int cnt = 1;

            for(int j= i+1;j <n;j++)  {
                if((arr[j - 1] % 2 == 0 && arr[j] % 2 != 0) || (arr[j - 1] % 2 != 0 && arr[j] % 2 == 0) ) {
                    cnt++;
                }
                else {
                    break;
                }
            }

            ans = Math.max(ans, cnt);
        }

        if(ans == 1) {
            return 0;
        }
        return ans;
    }

    //    Time Complexity is O(n)
//    Auxillary space is O(1)
    public static int maxEvenOdd(int arr[], int n) {

        if(n == 0) {
            return 0;
        }

        int maxLength = 0;

        int curLength = 1;
        int prevOdd = arr[0] % 2;

        for(int i=1;i<n;i++) {

            if(arr[i] %2 != prevOdd) {
                curLength++;
            }
            else {
                curLength = 1;
            }

            if (curLength > maxLength)
                maxLength = curLength;

            // updating even/odd nature of prev
            // number encountered everytime
            prevOdd = arr[i] % 2;
        }

        return maxLength;


    }




    static public void main(String[] args)
    {

        int[] arr = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };

        // longest subarray should be 1 2 3 4 5 , therefore
        // length = 5
        int n = arr.length;
        System.out.print(
                "Length of longest subarray of even and odds is : ");
        System.out.print(maxEvenOdd(arr, n));
    }
}
