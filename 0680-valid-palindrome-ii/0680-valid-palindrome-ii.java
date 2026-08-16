class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return validPalindromicString(s,left+1,right) ||
                       validPalindromicString(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindromicString(String s,int left,int right){
        int l=left;
        int r=right;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}