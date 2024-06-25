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

public class MaxConsecutiveOnes {

    static class CountClass {
        int count;
        int maxCount;
    }

    public int findMaxConsecutiveOnes(int[] arr) {
        CountClass obj = Arrays.stream(arr)
            .boxed()
            .reduce(new CountClass(), (countobj, num) -> {
                if (num == 1) {
                    countobj.count++;
                    countobj.maxCount = Math.max(countobj.count, countobj.maxCount);
                } else {
                    countobj.count = 0;
                }
                return countobj;
            }, (countobj1, countobj2) -> {
                countobj1.maxCount = Math.max(countobj2.maxCount, countobj1.maxCount);
                return countobj1;
            });

        return obj.maxCount;
    }
}
