class Solution {
    public boolean isPalindrome(int[] freq1,int[] freq){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int window_length=s1.length();
        for(int i=0;i<s2.length();i++){
            int index=i;
            int windowindex=0;
            int freq[]=new int[26];
            while(index<s2.length() && windowindex<window_length){
                freq[s2.charAt(index)-'a']++;
                index++;
                windowindex++;
            }
            if(isPalindrome(freq1,freq)){
                return true;
            }
        }
        return false;
    }
}