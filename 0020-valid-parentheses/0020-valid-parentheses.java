class Solution {
    public boolean isValid(String s) {

        // while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
        //     s = s.replace("()", "");
        //     s = s.replace("[]", "");
        //     s = s.replace("{}", "");
        // }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == ')' && st.pop() != '(') {
                    return false;
                } else if (ch == ']' && st.pop() != '[') {
                    return false;
                } else if (ch == '}' && st.pop() != '{') {
                    return false;
                } 
            }

        }
        return st.isEmpty();
    }
}


