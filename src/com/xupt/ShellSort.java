package com.xupt;

public class ShellSort {
    public void Shell(int[] arr , int len){
        if(arr == null && arr.length <= 1){
            return ;
        }
        int ic = len/2 ;
        while (ic >= 1){
            for(int i = 0 ; i < len-1 ;i ++){
                for(int j = i+1 ; j<len-ic+1 ; j++){
                    if(arr[i]>arr[j]){
                        int temp = arr[i] ;
                        arr[i] = arr[j];
                        arr[j] = temp ;
                    }
                }
            }
            ic = ic/2;
        }

    }
    public static void main(String[] args) {
        int [] arr={31,111,22,51,57,79,19};
        int len = arr.length;
        ShellSort sh = new ShellSort();
        sh.Shell(arr, len);
        for(int i = 0 ; i < len ; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
