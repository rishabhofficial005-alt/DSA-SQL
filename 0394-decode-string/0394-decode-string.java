import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                st.push(ch);
            }
            else{
                StringBuilder str=new StringBuilder();
                while(st.peek() != '['){
                    str.insert(0,st.pop());
                }
                st.pop();
                StringBuilder repeated=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    repeated.insert(0,st.pop());
                }
                int repeat=Integer.parseInt(repeated.toString());
                StringBuilder sub=new StringBuilder();
                for(int i=0;i<repeat;i++){
                    sub.append(str);
                }
                for(char c : sub.toString().toCharArray()){
                    st.push(c);
                }
            }
        }
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty()){
            result.insert(0,st.pop());
        }
        return result.toString();
    }
}