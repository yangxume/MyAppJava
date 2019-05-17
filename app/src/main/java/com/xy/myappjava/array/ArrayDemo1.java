package com.xy.myappjava.array;

public class ArrayDemo1 {

    public static void main(String [] args){

        int [] arra = {0,7,8,5,1,3,4,2,9};

        int maxIndex = ArrayTool.getMaxIndex(arra);
        System.out.println("maxIndex : "+maxIndex);

        int[] selectSortArray = ArrayTool.selectSort(arra);
        for (int value:selectSortArray){
            System.out.print(value+",");
        }


    }

}
