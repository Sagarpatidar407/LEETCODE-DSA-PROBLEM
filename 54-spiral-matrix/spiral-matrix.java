class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int srow = 0, scol = 0;
        int erow = m - 1, ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // Left -> Right
            for (int i = scol; i <= ecol; i++) {
                ans.add(arr[srow][i]);
            }
            srow++;

            // Top -> Bottom
            for (int i = srow; i <= erow; i++) {
                ans.add(arr[i][ecol]);
            }
            ecol--;

            // Right -> Left
            if (srow <= erow) {
                for (int i = ecol; i >= scol; i--) {
                    ans.add(arr[erow][i]);
                }
                erow--;
            }

            // Bottom -> Top
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    ans.add(arr[i][scol]);
                }
                scol++;
            }
        }

        return ans;
    }
}