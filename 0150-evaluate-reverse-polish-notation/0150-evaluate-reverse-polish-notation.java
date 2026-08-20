class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+")) {
                int b = st.pop();
                int a = st.pop();

                sum = a + b;
                st.push(sum);
            } else if (token.equals("-")) {
                int b = st.pop();
                int a = st.pop();

                sum = a - b;
                st.push(sum);

            } else if (token.equals("*")) {
                int b = st.pop();
                int a = st.pop();

                sum = a * b;
                st.push(sum);

            } else if (token.equals("/")) {
                int b = st.pop();
                int a = st.pop();

                sum = a / b;
                st.push(sum);

            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return sum;
    }
}