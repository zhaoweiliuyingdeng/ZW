package com.xupt;

public class Sort2 {
    public void Sotr(int[] arr , int n){
        for(int i = 1 ; i < n ; i++){
            int temp = arr[i] ;
            int j ;
            for( j = i ; j >0 && arr[j-1]>temp ; j--){
                arr[j] = arr[j-1] ;
            }
            arr[j] = temp ;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,5,8,4,7,6,9} ;
        int n = arr.length ;
        Sort2 ss = new Sort2();
        ss.Sotr(arr, n);
        for(int i = 0 ; i < n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
