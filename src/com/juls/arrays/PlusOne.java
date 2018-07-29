package com.juls.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by brayan on 28-07-18
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        String number="";
        for(int i=0;i<n;i++){
            number+=digits[i];
        }
        BigInteger digit=new BigInteger(number).add(BigInteger.ONE);
        int[] a=new int[digit.toString().length()];
        int i=digit.toString().length()-1;
        for(;!digit.equals(BigInteger.ZERO);digit=digit.divide(BigInteger.TEN)){
            a[i]= digit.mod(BigInteger.TEN).intValue();
            i--;
        }
        return a;
    }

    public int[] plusOne2(int[] digits) {

        if(digits == null) return new int[0];

        List<Integer> result = new ArrayList<Integer>();
        int carry = 1, sum = 0;//Initially the carry is 1 because we want to add 1 to the first digit.

        for(int i = digits.length - 1; i >= 0; i--) {
            sum = carry + digits[i];
            carry = sum / 10;
            result.add(sum % 10);
        }
        // incase it is something like 9999
        if(carry == 1) {
            result.add(carry);
        }

        // reverse the list to get the result
        int[] r = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            r[i] = result.get(result.size()-1-i);
        }
        return r;
    }

    public static void main(String[] args) {
        PlusOne one=new PlusOne();
        int[] r=new int[]{0,7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(one.plusOne2(r)));
    }
}
