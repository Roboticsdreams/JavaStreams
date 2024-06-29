package com.rdreams.interviewprep.leetcode.dsa.arrays101;

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
----------
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.

Example 2:
-----------
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:
--------------
    1 <= nums.length <= 105
    nums[i] is either 0 or 1.

*/
import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int zerocnt = (int) Arrays.stream(nums).filter(i -> i == 0).count();
        if (nums.length == 0 || zerocnt == nums.length) {
            return 0;
        }

        return IntStream.range(0, nums.length)
                .mapToObj(i -> {
                        int count = 1;
                        while (i + 1 < nums.length && nums[i] == nums[i + 1] && nums[i] == 1) {
                            count++;
                            i++;
                        }
                        return count;
                })
                .max(Integer::compareTo) // Use Integer::compareTo for efficient comparison
                .orElse(0);
    }
}