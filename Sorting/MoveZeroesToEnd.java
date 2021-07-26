package Sorting;

import java.util.*;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = new int[] { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int arr[]) {
        int k = 0;
        for(int i : arr){
            if(i != 0){
                arr[k++] = i;
            }
        }
        for(int i = k; i < arr.length; i++){
            arr[i] = 0;
        }
    }

}