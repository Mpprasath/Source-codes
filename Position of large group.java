class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ll=new ArrayList();
        int f=0,l=s.length();
        for(int i=0;i<l;i++){
            if(i==l-1||s.charAt(i)!=s.charAt(i+1)){
                if(i-f+1>=3) ll.add(Arrays.asList(new Integer[]{f,i}));
                f=i+1;
            }
        }
        return ll;
    }
}
