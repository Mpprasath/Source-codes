/*
Question:
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.

constraints:
1 <= nums.length <= 105
0 <= nums[i] <= 105
*/


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;
    }
}

