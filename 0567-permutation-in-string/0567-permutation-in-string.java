class Solution {
    public boolean Permutation(int []freq1,int []freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int window_length=s1.length();
        int freq1[]=new int[26];
       
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            int minindex=i;
            int windowindex=0;
            int freq2[]=new int[26];
            while(minindex<s2.length() && windowindex<window_length){
                freq2[s2.charAt(minindex)-'a']++;
                minindex++;
                windowindex++;
            }
            if(Permutation(freq1,freq2)){
               return true;
            }
        }
        return false;
    }
}