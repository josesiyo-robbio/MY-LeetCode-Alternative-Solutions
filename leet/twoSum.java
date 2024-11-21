package leet;

/*
    
    Given an array of integers nums and an integer target, 
    return the indices of the two numbers that add up to the target.
    You can assume there is exactly one solution, and you cannot use 
    the same element twice.
    The answer can be returned in any order.
 */


import java.util.Arrays;

public class twoSum
{
    public static void main(String[] args)
    {
        Solution twoSum = new Solution();
        int[] nums = {2, 8, 11, 7};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); 
    }
}



class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i,j};

                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");  
    }
}