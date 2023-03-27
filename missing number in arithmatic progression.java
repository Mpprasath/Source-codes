class Solution {
    public int missingNumber(int[] arr) {
        int l=arr.length-1;
        int diff=(arr[l]-arr[0])/arr.length;
        if(diff==0){
            return arr[0];
        }
        for(int i=0;i<=l-1;i++){
            if(arr[i+1]-arr[i]!=diff){
                return arr[i]+diff;
            }
        }
        return 0;
    }
}
