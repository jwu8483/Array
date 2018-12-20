package com.company;

public class Arrays {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int cheese : arr) {
            sum += cheese;
        }
        return sum;

    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sumArr = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            sumArr[i] = arraySum(arr2D[i]);
        }
        return sumArr;
    }
    public static boolean isDiverse(int[][] arr2D){

        int [] sumArr = rowSums(arr2D);

        for(int i = 0; i < sumArr.length; i++){

            for(int j = i+1; j < sumArr.length; j++){

                if(sumArr[i] == sumArr[j]){

                    return false;
                }
            }
        }  return true;
    }

}
