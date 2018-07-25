package com.juls.arrays;

/**
 * Created by brayan on 25-07-18
 */
public class MaxConsecutivesOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int k=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                k++;
                if(k>max)
                    max=k;
            }else{

                k=0;
            }
        }

        return max==0?k:max;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,1,1,0,0,0,1,1,1,1,1};
        MaxConsecutivesOnes ones = new MaxConsecutivesOnes();
        System.out.println(ones.findMaxConsecutiveOnes(a));
    }
}
