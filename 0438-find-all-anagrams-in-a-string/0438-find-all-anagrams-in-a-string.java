class Solution {
    public boolean Permutation(int freq1[],int freq2[]){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }    
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        int window_length=p.length();
        int freq1[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            int index=i;
            int windowindex=0;
            int freq2[]=new int[26];
            while(index<s.length() && windowindex<window_length){
                freq2[s.charAt(index)-'a']++;
                index++;
                windowindex++;
            }
            if(Permutation(freq1,freq2)){
                ans.add(i);
            }
        }
        return ans;
    }
}