class Solution {
    public String decodeString(String s) {
        Stack<String> str = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int currnum = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                currnum = (currnum * 10) + (ch - '0');
            } else if (ch == '[') {
                num.push(currnum);
                currnum = 0;
                str.push("[");

            } else if (ch != ']') {
                str.push("" + ch);
            } else {
                String temp = "";
                while (!str.isEmpty() && !str.peek().equals("[")) {
                    temp = str.pop() + temp;
                }
                str.pop();
                int z = num.pop();
                StringBuilder sb = new StringBuilder("");
                for (int j = 0; j < z; j++) {
                    sb.append(temp);
                }
                str.push(sb.toString());
            }
        }

        StringBuilder sb = new StringBuilder("");
        while (!str.isEmpty()) {
            sb.insert(0, str.pop());
        }
        return sb.toString();
    }
}