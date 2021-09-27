package iiht_Assignments;

public class twoDMatrixConstruction {
    public static void main(String args[]) {
        int matrix[][] = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        for (int num[] : matrix) {
            for (int num1 : num) {
                System.out.println(num1);
            }
        }
    }

}
