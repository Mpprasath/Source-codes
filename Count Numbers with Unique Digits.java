class Solution {
   public int uniquedigits(int n)
    {
        int total=1,val=9;
        for(int i=1;i<=n;i++)
        {
            if(i==1) total*=9;
            else{
                total*=val;
                val--;
            }
        }
        return total;
    }
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int total=10;
        for(int i=2;i<=n;i++)
        {
            total+=uniquedigits(i);
        }
        return total;
    }
}
