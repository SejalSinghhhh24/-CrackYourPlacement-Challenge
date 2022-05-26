Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
2 <= k <= 104

  
  
  CODE:
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       /* int c=0; //O(n^2)
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                if(s%k==0){

                c++;}
            }
        }
        return c;*/
        int[] count = new int[k];
    int remSum = 0;
    for(int n : nums){
        remSum += ((n % k) + k) % k;
        // if we get the same reminder value then we will increment that value by one.
        count[remSum % k]++;
    }
    int result = count[0];
    for(int c : count){
        // this formula is used to find the possible set of subarray
        result += (c * ( c - 1)) /2;
    }
        return result;
    }
}
