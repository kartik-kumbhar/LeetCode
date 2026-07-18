class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> st = new Stack<>();

        for (String dir : arr) {
            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            if (dir.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }

        if (sb.length() != 0) {
            return sb.toString();
        }
        return "/";
    }
}