package com.juls.arrays;

/**
 * Created by brayan on 29-07-18
 */
public class FindPivot {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int val=0;
        int index=-1;
        for(int i=0;i<n;i++){
            val+=nums[i];
        }
        int acc=0;
        for(int i=0;i<n;i++){
            int leftval=val-acc-nums[i];
            if(leftval==acc){
                index=i;
                break;
            }
            acc+=nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        FindPivot findPivot=new FindPivot();
        int[] a=new int[]{1,7,3,6,5,6};
        System.out.println(findPivot.pivotIndex(a));
    }
}
