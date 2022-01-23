package com.company;

import java.util.Arrays;

public class Main {

    private int[] merge (int[] arr1, int[] arr2){


    if (arr1.length>0 && arr2.length>0) {

    int index1=0;
    int index2=0;
    int index3=0;
    boolean find=false;

    int[] arrMerge = new int[arr1.length+arr2.length];


        while (index3 < arrMerge.length) {
            if (arr1[index1] <= arr2[index2] && find == false) {
                arrMerge[index3] = arr1[index1];
                if (index1 == arr1.length - 1) {
                    arr1[index1] = 2147483647;
                }
                if (index1 < arr1.length - 1) {
                    index1++;
                }
                find = true;
            }
            if (arr2[index2] < arr1[index1] && find == false) {
                arrMerge[index3] = arr2[index2];
                if (index2 == arr2.length - 1) {
                    arr2[index2] = 2147483647;
                }
                if (index2 < arr2.length - 1) {
                    index2++;
                }
                find = true;
            }

            find = false;
            index3++;
        }

        return arrMerge;

    }
    else
    {
        System.out.println("Направлен пустой массив данных!");
        return null;
    }
    }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();

        int[] arr1 = {1,4,5,7,10};
        int[] arr2 = {2,3,3,6};


        System.out.println(Arrays.toString(main.merge(arr1,arr2)));


    }
}
