package com.xupt;

public class ShellSort1 {
    public void Shell(int[] arr , int len){
        if(arr == null && arr.length <= 1){
            return ;
        }
        int ic = len/2 ;
        while (ic >= 1){
            for(int i = 0 ; i < len-1 ;i ++){
                for(int j = i ; j<len-ic ; j+=ic){
                    if(arr[j]>arr[j+ic]){
                        int temp = arr[j] ;
                        arr[j] = arr[j+ic];
                        arr[j+ic] = temp ;
                    }
                }
            }
            ic = ic/2;
        }

    }
    public static void main(String[] args) {
        int [] arr={3,2,5,8,4,7,6,9};
        int len = arr.length;
        ShellSort1 sh = new ShellSort1();
        sh.Shell(arr, len);
        for(int i = 0 ; i < len ; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
