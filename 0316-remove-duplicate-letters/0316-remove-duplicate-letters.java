class Solution {
    public String removeDuplicateLetters(String s) {
        int lastindex[] =new int [26];
        boolean visted[]= new boolean[26];
        for(int i=0;i<s.length();i++){
            lastindex[s.charAt(i)-'a']=i;
        }
        StringBuilder stack= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(visted[s.charAt(i)-'a']){
                continue;
            }
            while(!stack.isEmpty() && stack.charAt(stack.length()-1) > ch 
            && lastindex[stack.charAt(stack.length()-1)-'a']>i){
                visted[stack.charAt(stack.length()-1)-'a']=false;
                stack.deleteCharAt(stack.length()-1);
              
            }
            stack.append(ch);
            visted[s.charAt(i)-'a']=true;
        }
        return stack.toString();
    }
}