/*
 * This example shows how to create and iterate through a 
 * two-dimensional array in row-major order.
 */
public class E03TwoDArray {

    public static void main(String[] args) {
        int[][] array = new int[10][15];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println(array[row][col]);
            }
        }
    }

}
