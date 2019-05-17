package com.xy.myappjava.array;

public class ArrayTool {

    private ArrayTool() {

    }

    public static int getMaxIndex(int[] arr) {

        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;

    }

    public static int [] selectSort(int [] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
