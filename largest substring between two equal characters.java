class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=0;
        boolean t=true;;
        for(int i=1;i<s.length();i++){  
            for(int j=i;j<s.length();j++){
                if(s.charAt(i-1)==s.charAt(j)){
                 t=false;
                    if(j-i>max){
                        max=j-i;
                    }
                }                
            }
        }
        if(t){
            return -1;
        }     
     return max;
    }
}
