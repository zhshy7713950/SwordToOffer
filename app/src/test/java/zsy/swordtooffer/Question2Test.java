package zsy.swordtooffer;

import org.junit.Test;

import zsy.swordtooffer.question2.MatrixFind;

public class Question2Test {

    @Test
    public void main(){
        int[][] matrix = {
                {1,3,6,8,10},
                {2,4,7,9,12},
                {5,8,9,10,14},
                {7,12,14,17,20},
                {10,15,18,21,24}
        };
        System.out.println(MatrixFind.find(matrix,matrix[0].length,matrix.length,71));
        System.out.println(MatrixFind.find(matrix,matrix[0].length,matrix.length,12));
    }
}
