package com.juls.arrays;

import java.util.Arrays;

/**
 * Created by brayan on 24-07-18
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] a={2,3,4};
        System.out.println(Arrays.toString(twoSum.twoSum(a, 6)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        int[] indices=null;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                indices=new int[]{i+1,j+1};
                break;
            }else if(numbers[i]+numbers[j]>target){
                j-=1;
            }else{
                i+=1;
            }

        }
        return indices;
    }
}
