class Solution {
    public void fn(int s,int n,ArrayList<Integer>temp,List<List<Integer>>res){
        if(n<=1){
            if(temp.size()>1){
                res.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        for(int i=s;i<=n;i++){
            if(n%i==0){
                temp.add(i);   
                fn(i,n/i,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res =new ArrayList<List<Integer>>();
        fn(2,n,new ArrayList<Integer>(),res);
        return res;        
    }
}
