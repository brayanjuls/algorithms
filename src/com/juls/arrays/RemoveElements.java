package com.juls.arrays;

import java.util.Arrays;

/**
 * Created by brayan on 25-07-18
 */
public class RemoveElements {


    public int removeElement(int[] nums, int val) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[m]=nums[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        RemoveElements elements=new RemoveElements();
        int[] a=new int[]{1,2,6,4,5,0,2};
        System.out.println(Arrays.toString(a));
        System.out.println(elements.removeElement(a,6));
        System.out.println(Arrays.toString(a));
    }
}
