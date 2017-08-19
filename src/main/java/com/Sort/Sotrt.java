package com.Sort;

import java.util.Scanner;

/**
 * Created by jan on 2017-08-19.
 */
public class Sotrt {
    public static void main(String[] args) {
        System.out.println("podaj wielkość tablicy: ");
        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();

        int [] arrayN = new int[n];

        for (int i=0; i< arrayN.length  ; i++){
            System.out.println("podaj kolejną liczbę : "+i);
            arrayN[i]= scanner.nextInt();

        }
        //bubble sort
          arrayN=doBubbleSort(arrayN);
        for (int i=0; i<arrayN.length; i++){
            System.out.println(arrayN[i]);
        }
    }
    public static int [] doBubbleSort(int[] arrayN){
        int n=arrayN.length;

        if (n > 1) {


        boolean check =true;
        while (check){

            check= false;
            for (int i=n-1;i>0;i--) {
                if (arrayN[i] < arrayN[i - 1]) {
                    int temp = arrayN[i];
                    arrayN[i] = arrayN[i - 1];
                    arrayN[i - 1] = temp;
                    check = true;
                }
            }
            }

        }return arrayN;
    }
}
