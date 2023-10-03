import java.util.Arrays;

class MultiDimensionalArray2{
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i =numbers.length - 1; i >= 0; i--) {
            int[] row = numbers[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
