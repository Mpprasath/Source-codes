class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        List<String>l=Arrays.asList(s.split("\\s+"));
        Collections.reverse(l);
        return String.join(" ",l);
    }
}
