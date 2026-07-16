class Solution {
    public boolean isValid(String s) {

        // while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
        //     s = s.replace("()", "");
        //     s = s.replace("[]", "");
        //     s = s.replace("{}", "");
        // }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (ch == ')' && stack.pop() != '(') {
                    return false;
                } else if (ch == ']' && stack.pop() != '[') {
                    return false;
                } else if (ch == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}