class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j) {
        //             sum += mat[i][j];
        //         }

        //         else if (i + j  == n-1 && i != j) {
        //             sum += mat[i][j];
        //         }
        //     }

        // }

        for(int i=0;i<n;i++){
            //pd
            sum+=mat[i][i];

            //sd
            int j=n-1-i; //i+j+1=n    
            if(i!=n-1-i){     
                sum+=mat[i][j];    
            }
        }

        return sum;
    }
}