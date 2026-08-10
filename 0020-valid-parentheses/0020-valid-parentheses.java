class Solution {
    public boolean isValid(String s) {

        // while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
        //     s = s.replace("()", "");
        //     s = s.replace("[]", "");
        //     s = s.replace("{}", "");
        // }
        // return s.isEmpty();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (ch == ')' && stack.peek() != '(' || ch == ']' && stack.peek() != '['
                        || ch == '}' && stack.peek() != '{') {
                    return false;

                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
