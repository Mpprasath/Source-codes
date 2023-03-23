class Solution {
    public boolean confusingNumber(int n) {
        Map<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,0);
        mpp.put(1,1);
        mpp.put(6,9);
        mpp.put(8,8);
        mpp.put(9,6);
        int c=n,rnum=0;
        while(c>0){
            int res=c%10;
            if(!mpp.containsKey(res)){
               return false;
            }
            rnum=rnum*10+mpp.get(res);
            c/=10;
        }
        return rnum!=n;
    }
}
