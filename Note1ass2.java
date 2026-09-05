import java.util.Arrays;
class Note1ass2 {
    public static void main(String[] args) {
        int[][] mat_a ={
            {2, 5, 23},
            {45, 53, 10},
            {45, 67, 49}
        } ;
        int[][] mat_b ={
                {75, 90, 23},
                {31, 68, 18},
                {71, 7, 40}
        } ;
        int[][] mat_c = new int[3][3];
        for (int i=0; i<mat_a.length; i++){
            for (int j=0; j<mat_a[i].length; j++){
                mat_c[i][j] = mat_a[i][j] + mat_b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(mat_c));
        for (int[] ints_arr : mat_c){
            for (int ints: ints_arr){
                System.out.print(ints+" ");
            }
            System.out.println();
        }
    }

}