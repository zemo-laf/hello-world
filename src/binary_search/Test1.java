package binary_search;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args){
        int arr[]={8,1,34,45,4,8,89,2};
        int key=8;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
     System.out.println(Test1.binarySearch(arr,key));
    }
    static int binarySearch(int[] arr,int key){
        int low=0; //数组最小索引值
        int high=arr.length-1; //数组最大索引值
        while(low<=high){
            int mid=(int)(Math.floor((low+high)/2));
            if(key==arr[mid]){
                return mid;
            }else if(key>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1; //low>high的情况，这种情况下key的值大于arr中最大的元素值或者key的值小于arr中最小的元素值
    }
}
