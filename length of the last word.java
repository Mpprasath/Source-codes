class Solution {
    public int lengthOfLastWord(String s) {     
       String ans=s.trim();
       int n=ans.length()-1;
       int last=n;
       while(n>=0&&ans.charAt(n)!=' '){
           n--;
       }
       return last-n; 
    }
}
