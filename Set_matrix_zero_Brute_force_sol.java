import java.util.*;

public class Set_matrix_zero_Brute_force_sol{
    //Function to set all elements of a given row in the inputted two-dimensional array as -1
    static void markRows(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i){

        for(int j=0; j<m; j++){

           if( matrix.get(i).get(j)!= 0){

            matrix.get(i).set(j, -1);

           }
        }
    }
    static void markColumns(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j){

        for (int i =0; i < n; i++){

            if( matrix.get(i).get(j) != 0 ){

                matrix.get(i).set(j, -1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        for(int i=0; i<n ; i++){
            for(int j = 0 ; j < m ; j++){
                if (matrix.get(i).get(j)==0){
                    markRows(matrix, n, m, i);
                    markColumns(matrix, n, m, j);
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));    

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);
        
        System.out.println("The Final matrix is: ");

        for (ArrayList<Integer> row : ans) {

            for (Integer ele : row) {

                System.out.print(ele + " ");

            }

            System.out.println();
        }
    }
}
