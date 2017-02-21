//Clayton Szelestey
//Software Development
//Lab 5
public class Problem8_10 {

	public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int rowIndex = 0;
        int largest = -1;
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = (int)(Math.random() * 2);
                rowCount += matrix[i][k];
            }
            if (rowCount > largest) {
            	rowIndex = i;
                largest = rowCount;
            }
        }

        int columnIndex = 0;
        largest = -1;
        for (int k = 0; k < matrix[0].length; k++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnCount += matrix[i][k];
            }
            if (columnCount > largest) {
                largest = columnCount;
                columnIndex = k;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println("");
        }
        System.out.println("The largest row index: " + rowIndex);
        System.out.println("The larges column index: " + columnIndex);
    }


}
