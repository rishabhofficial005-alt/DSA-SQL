class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        int skipsS=0;
        int skipsT=0;
        while(i>=0 || j>=0){
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skipsS++;
                    i--;
                }
                else if(skipsS>0){
                    skipsS--;
                    i--;
                }
                else{
                    break;
                }
            }
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipsT++;
                    j--;
                }
                else if(skipsT>0){
                    skipsT--;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i>=0 && j>=0){
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }
            else{
                if(i>=0 || j>=0){
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;

    }
}