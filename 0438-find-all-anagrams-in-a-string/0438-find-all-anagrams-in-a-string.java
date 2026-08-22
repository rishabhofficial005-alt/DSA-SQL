class Solution {
    public boolean checksame(int []freq1,int []windowfreq){
        for(int i=0;i<26;i++){
            if(freq1[i]!=windowfreq[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int freq1[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        int windowlength=p.length();
        for(int i=0;i<s.length();i++){
            int windowfreq1[]=new int[26];
            int index=i;
            int windowindex=0;
            while(index<s.length() && windowindex<windowlength){
                windowfreq1[s.charAt(index)-'a']++;
                index++;
                windowindex++;
            }
            if(checksame(freq1,windowfreq1)){
                ans.add(i);
            }
        }
        return ans; 
        
    }
}