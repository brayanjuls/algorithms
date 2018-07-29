package com.juls.arrays;

import java.util.Arrays;

/**
 * Created by brayan on 29-07-18
 */
public class LargestNumber {
    public int dominantIndex(int[] nums) {
        int index=-1;
        int n=nums.length;

        if(n==1)
            return 0;

        int[] rep=nums.clone();
        int largestn=0;
        Arrays.sort(rep);

        if(rep[n-1]>=(rep[n-2]*2)){
            largestn= rep[n-1];
        }else{
            return index;
        }


        for(int i=0;i<n;i++){
            if(largestn==nums[i])
                index=i;
        }
        return index;
    }

    public static void main(String[] args) {
        LargestNumber largestNumber=new LargestNumber();
        int[] a=new int[]{0,0,0,1};
        System.out.println(largestNumber.dominantIndex(a));
    }

}
