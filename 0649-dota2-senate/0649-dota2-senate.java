class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        int n = senate.length();
        for (int i = 0; i < n; i++) {
            char ch = senate.charAt(i);
            if (ch == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }

        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.remove();
            int d = dire.remove();

            if (r < d) {
                radiant.add(r + n);
            } else {
                dire.add(d + n);
            }
        }

        // if(dire.isEmpty()){
        //     return "Radiant";
        // }
        // return "Dire";
        return dire.isEmpty() ? "Radiant" : "Dire";

    }
}