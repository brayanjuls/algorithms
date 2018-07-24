package com.juls.arrays;

import java.util.Arrays;

/**
 * Created by brayan on 24-07-18
 */
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        int n = (nums.length/2);
        int i=0;
        int j=1;
        int l=0;
        int val=0;
        Arrays.sort(nums);
        while(l<n){
            val+=min(nums[i],nums[j]);
            j+=2;
            i+=2;
            l++;
        }
        return val;
    }

    private int min(int firstV,int secondV){
        return firstV>secondV?secondV:firstV;
    }

    public static void main(String[] args) {
        int[] a={1,4,3,2};
        ArrayPartition arrayPartition=new ArrayPartition();
        System.out.println(arrayPartition.arrayPairSum(a));
    }
}
