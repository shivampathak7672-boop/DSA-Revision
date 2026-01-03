 //two pointer approach

// import java.util.*;

// public class sort01s {
//     public static void main(String[] args){
//         int arr[] = {0,1,0,1,1,0,0,1,0};
//         int n = arr.length;
//         int left = 0;
//         int right = n - 1;
//         while (left<right){
//             if(arr[left]==1 & arr[right]==0){
//                 int temp= arr[left];
//                 arr[left]=arr[right];
//                 arr[right]=temp;

//                 right--;
//                 left++;
//             }
//             if (arr[left]==0) left++;
//             if (arr[right]==1) right--;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }



// two pointer naive approach
import java.util.*;

public class sort01s {
    public static void main(String [] args){
        int arr[]={0,1,0,1,1,0,0,1,0};
        int zerocount =0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]==0) zerocount++;

        }
        for(int i=0;i<arr.length;i++){
            if (i< zerocount){
                arr[i]=0;

            }
            else{
                arr[i]=1;
            }

        }

        System.out.println(Arrays.toString(arr));


    }
}