class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=PalindromicSubstring(s,i,i); //odd palindrome
            count+=PalindromicSubstring(s,i,i+1); // even palindrome
        }
        return count;
    }
    public int PalindromicSubstring(String s,int left,int right){
        int count=0;
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}