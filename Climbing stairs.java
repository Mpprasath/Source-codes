class Solution {
    public int climbStairs(int n) {
        double s5=Math.sqrt(5);
        double p1=(1+s5)/2;
        double p2=(1-s5)/2;
        return (int)((Math.pow(p1,n+1)-Math.pow(p2,n+1))/s5);
    }
}
