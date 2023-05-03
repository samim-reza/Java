import java.util.Arrays;

class Matrix{
    static private int numOfObjects=0;
    public static int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    Matrix(){
        numOfObjects = matrix.length * matrix[0].length;
    }
    public static int getNumOfObjects() {
        return numOfObjects;
    }
    public static void print(){
        for(int i=0; i<matrix.length; i++){
        System.out.println(Arrays.toString(matrix[i]));}
    }
    static Matrix matrixOp(){
        //int x=matrix[0][0];
        int x=0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<i+1;j++){
//                if(i<j){
//                    break;
//                }

                x=x+matrix[i][j];
                matrix[i][j]=x;
            }
        }
        return new Matrix();
    }
}
public class MatrixOperation {

    public static void main(String[] args) {
        Matrix mm=new Matrix();
        Matrix.matrixOp();
         for(int i=0;i<3; i++){
             System.out.println(Arrays.toString(Matrix.matrix[i]));
         }
    }
}
