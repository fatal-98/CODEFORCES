package codeforce;
import java.util.*;
public class question {
    public static int max_subarray_sum(int []arr ){
        int maxi =0;
        int sum = 0;
        int n =arr.length;
        for(int i=0;i<n;i++){
          if (arr[i]%2 !=0 && arr[i+1]%2 ==0){
            sum += arr[i];
          }
          else if(arr[i]%2 ==0 && arr[i+1]%2 !=0){
            sum += arr[i];
          }
          maxi = Math.max(maxi , sum);
          if(sum <0) sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        int[] arr1 = new int[q];
        int max = max_subarray_sum(arr1);
        System.out.println(max);
    }
    
}
