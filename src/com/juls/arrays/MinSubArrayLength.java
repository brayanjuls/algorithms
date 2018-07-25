package com.juls.arrays;

/**
 * Created by brayan on 25-07-18
 */
public class MinSubArrayLength {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0;
        int k=0;
        int n=nums.length;
        int val=0;
        int cur=0;
        int counter=0;
        while(i<n){
            if(cur>=s){
                val=counter<val || val==0?counter:val;
                i++;
                k=i;
                cur=0;
                counter=0;
            }else if(cur<s){
                if(k==n){
                    i++;
                    k=i;
                    cur=0;
                    counter=0;
                    continue;
                }
                cur+=nums[k];
                k++;
                counter++;
            }else{
                i++;
                k=i;
                cur=0;
                counter=0;
            }


        }
        return val;
    }

    public static void main(String[] args) {
        MinSubArrayLength subArrayLength=new MinSubArrayLength();
        int[] a=new int[]{2,3,1,2,4,3};
        System.out.println(subArrayLength.minSubArrayLen(7,a));
    }
}
