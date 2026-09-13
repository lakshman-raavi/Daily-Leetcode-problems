class Solution {
    public void reverseRow(int n, int row, int[][] image) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = image[row][left];
            image[row][left] = image[row][right];
            image[row][right] = temp;
            left++;
            right--;
        }

    }

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            reverseRow(n, i, image);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}
