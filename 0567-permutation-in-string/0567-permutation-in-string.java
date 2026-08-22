class Solution {
    public boolean CheckPermutation(int []windowfreq, int[] freq1){
        for(int i=0;i<26;i++){
            if(windowfreq[i] != freq1[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int windowfreq[]=new int [26];
        
        int windowlength=s1.length();
        for(int i=0;i<s1.length();i++){
            windowfreq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            int index=i;
            int windowindex=0;
            int freq1[]=new int[26];
            while(index<s2.length() && windowindex<windowlength){
                freq1[s2.charAt(index)-'a']++;
                windowindex++;
                index++;
            }
            if(CheckPermutation(windowfreq,freq1)){
                return true;
            }
            

        }
        return false;
    }
}