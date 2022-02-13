package com.company;
import java.util.*;
class Solution3 {
    int [] nums ={-4,-1,0,3,10};
    public int[] sortedSquares() {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
public class squareSortedArray {
    public static void main(String[] args) {
        Solution3 sc = new Solution3();
        System.out.println(Arrays.toString(sc.sortedSquares()));
    }
}
