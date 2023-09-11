package LeetCode;

import java.util.Collections;
import java.util.HashMap;

// leetcode 1
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] answer = twoSum(arr,9);
        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i]);
        }
//        System.out.println(twoSum(arr, 9));

    }

    static public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }

        }
        return arr;
    }
}
