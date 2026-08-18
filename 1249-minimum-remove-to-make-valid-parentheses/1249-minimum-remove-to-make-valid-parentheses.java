class Solution {
    public String minRemoveToMakeValid(String s) {

        int open = 0;
        StringBuilder first = new StringBuilder();

        // PASS 1: Remove extra ')'
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
                first.append(ch);
            }

            else if (ch == ')') {

                if (open > 0) {
                    open--;
                    first.append(ch);
                }

                // If open == 0:
                // this ')' is extra, so DON'T append it
            }

            else {
                // Normal character
                first.append(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        int close = 0;

        // PASS 2: Remove extra '('
        for (int i = first.length() - 1; i >= 0; i--) {

            char ch = first.charAt(i);

            if (ch == ')') {
                close++;
                ans.append(ch);
            }

            else if (ch == '(') {

                if (close > 0) {
                    close--;
                    ans.append(ch);
                }

                // If close == 0:
                // this '(' is extra, so DON'T append it
            }

            else {
                // Normal character
                ans.append(ch);
            }
        }

        return ans.reverse().toString();
    }
}