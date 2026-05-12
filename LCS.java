public class Main {
    public static void main(String[] args) {
        String S1 = "Your Complete Name Here"; // Replace with your name
        String S2 = "ETAOINSHR";
        
        int m = S1.length();
        int n = S2.length();
        int[][] L = new int[m+1][n+1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (S1.charAt(i-1) == S2.charAt(j-1)) {
                    L[i][j] = L[i-1][j-1] + 1;
                } else {
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
                }
            }
        }
        
        // Reconstruct LCS
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (S1.charAt(i-1) == S2.charAt(j-1)) {
                lcs.append(S1.charAt(i-1));
                i--; j--;
            } else if (L[i-1][j] > L[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }
        
        System.out.println("Length of LCS: " + L[m][n]);
        System.out.println("LCS: " + lcs.reverse());
    }
}
