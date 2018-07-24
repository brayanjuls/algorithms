package com.juls.arrays;

import java.util.Arrays;

/**
 * Created by brayan on 23-07-18
 */
public class ReverseString {
    public void reverse(int[] v, int N) {
        int i = 0;
        int j = N - 1;
        while (i < j) {
            swap(v, i, j);  // this is a self-defined function
            i++;
            j--;
        }
    }
    public String reverseString(String s) {
     char[] charArray=s.toCharArray();
     int i=0;
     int j=charArray.length - 1;
     while (i<j){
         swap(charArray,i,j);
         i++;
         j--;
     }
     return  String.valueOf(charArray);
    }

    private void swap(char[] v, int i, int j) {
        char first=v[i];
        v[i]=v[j];
        v[j]=first;
    }

    private void swap(int[] v, int i, int j) {
        int first=v[i];
        v[i]=v[j];
        v[j]=first;
    }

    public static void main(String[] args) {

        ReverseString reverseString=new ReverseString();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverseString.reverse(arr,10);
        System.out.println(Arrays.toString(arr));


        String testword="Tacocat";
        System.out.println(testword);
        System.out.println(reverseString.reverseString(testword));
       // System.out.println(new StringBuilder(testword).reverse());

    }
}
