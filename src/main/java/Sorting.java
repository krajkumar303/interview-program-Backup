package com.raj.sample;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String input1="1,3,5";
        String input2="2,4,6";
        String stringJoin= String.join(",",input1,input2);
        int[] mergedNumbers = Arrays.stream(stringJoin.split(",")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <mergedNumbers.length ; i++) {
            for (int j = i; j < mergedNumbers.length; j++) {
                if(mergedNumbers[j]<mergedNumbers[i]){
                    int temp=mergedNumbers[i];
                    mergedNumbers[i]=mergedNumbers[j];
                    mergedNumbers[j]=temp;
                }
            }
        }
        Arrays.stream(mergedNumbers).forEach(e-> System.out.println(e));
    }
}
