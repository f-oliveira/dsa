package exercises.arrays_strings;

public class ZeroMatrix {
    /*
        Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
        column are set to 0.
        Hints:#17, #74, #702
    */

    public static int[][] zeroMatrix(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    for (int k = 0; k < matriz.length; k++) {
                        matriz[k][j] = 0;
                    }

                    for (int k = 0; k < matriz[i].length; k++) {
                        matriz[i][k] = 0;
                    }

                    continue;
                }
            }
        }
        
        return matriz;
    }

    public static void main (String[] args) {

        int[][] result = zeroMatrix(new int[][] {{0, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}});

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }

}
