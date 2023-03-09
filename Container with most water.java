class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,res=0;
        while(l<r){
        if(height[l]<=height[r]){
             res=Math.max(((r-l)*height[l]),res);
             l++;
        }else{
             res=Math.max(((r-l)*height[r]),res);
             r--;
        }
        }
         return res;
    }
   
}
