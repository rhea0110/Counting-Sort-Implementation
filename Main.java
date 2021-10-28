package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 10, 9, 7, 8, 2, 3, 4};
        int size = arr.length;
            countingSort(arr, 1, 10);
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] arr = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            arr[input[i] - min]++;
        }
        int j = 0;
        for(int i = min; i <= max; i++){
            while(arr[i - min] > 0){
                input[j++] = i;
                arr[i - min]--;
            }
        }
    }
}

