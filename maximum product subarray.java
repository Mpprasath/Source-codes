class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i;j<nums.length;j++){
                c*=nums[j];
                res=Math.max(res,c);
            }
        }
        return res;
    }
}
