package com.xupt;

public class Sort {
    public void Sotr(int[] arr , int n){
        for(int i = 0 ; i < n-1 ; i++){
            int temp = 0 ;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j]<arr[i]){
                    temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,5,8,4,7,6,9} ;
        int n = arr.length ;
        Sort ss = new Sort();
        ss.Sotr(arr, n);
        for(int i = 0 ; i < n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
