import java.util.*;
class Solution {
    public int calculate(String s) {
        int num=0;
        int sign=1;
        int result=0;
        Stack<Integer> st=new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch == '+'){
                result+=sign*num;
                num=0;
                sign=1;
            }
            else if(ch == '-'){
                result+=sign*num;
                num=0;
                sign=-1;
            }
            else if(ch == '('){
                st.push(result);
                st.push(sign);
                //Reseting the result and sign
                result=0;
                sign=1;
            }
            else if(ch == ')'){
                result+=num*sign;
                num=0;
                int previoussign=st.pop();
                int previousresult=st.pop();
                result=previousresult+previoussign*result;
                
            }
        }    
            result+=sign*num;
            return result;
        
    }
}