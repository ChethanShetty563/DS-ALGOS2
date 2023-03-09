package Arrays;

public class LeftRotateByD {

    public static void leftRotateByD(int arr[], int n, int d) {

        int temp[] = new int[d];

        for(int i=0;i<d;i++) {
            temp[i] = arr[i];
        }

        int count = 0;
        for(int i=d;i<n;i++) {
            arr[count++] = arr[i];
        }

        for(int i=0;i<d;i++) {
            arr[count++] = temp[i];
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

        System.out.println("Before Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        leftRotateByD(arr, n, d);

        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
