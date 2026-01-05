package com.stackqueue.hashmap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
      
        if (nums.length == 0) {
            return 0;
        }

    
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequenceLength = 0;

      
        for (int num : numSet) {
         
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequenceLength = 1;

             
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequenceLength++;
                }

              
                longestSequenceLength = Math.max(longestSequenceLength, currentSequenceLength);
            }
        }

        return longestSequenceLength;
    }

    public static void main(String[] args) {
        int[] input1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + longestConsecutive(input1));

    }
}
