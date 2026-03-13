import java.util.*;

public class Problem9_TwoSumTransactions {

    public static void twoSum(int[] arr,int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int complement=target-arr[i];

            if(map.containsKey(complement)){
                System.out.println("Pair: "+arr[i]+" "+complement);
            }

            map.put(arr[i],i);
        }
    }

    public static void main(String[] args){

        int arr[]={500,300,200};
        twoSum(arr,500);
    }
}