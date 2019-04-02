package zsy.swordtooffer.question2;
//二维数组中查找
public class MatrixFind {

    /**
     * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和整数，判断数组中是否含有该整数
     * 1 2 8 9
     * 2 4 9 12
     * 4 7 10 13
     * 6 8 11 15
     *
     * 思路：一行一行遍历效率较低。可以采取从右上角开始查找，如果右上角数字大于需求n，则可排除当前列
     * 如果小于n，则可以排除当前行
     * */
    public static boolean find(int[][] matrix,int rows,int columns,int number){
        boolean found = false;
        if(matrix != null && rows > 0 && columns > 0){
            int row = 0;
            int column = columns-1;
            while (row < rows && column >= 0){
                if(matrix[row][column] == number){
                    found = true;
                    break;
                }else if(matrix[row][column] > number)//如果右上角数字大于需求n，则可排除当前列
                    column--;
                else//如果小于n，则可以排除当前行
                    row++;
            }
        }
        return found;
    }
}
