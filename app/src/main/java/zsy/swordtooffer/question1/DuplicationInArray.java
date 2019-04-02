package zsy.swordtooffer.question1;
//数组中重复的数字
public class DuplicationInArray {

    /**
     * 问题一：找出数组中重复的数字。
     * 在一个长度为n的数组里的所有数字都在0~n-1范围内。数组中某些数字是重复的，但不知道每个数字
     * 重复了几次。请找出数组中任意一个重复的数字。例如，如果长度为7的数组{2,3,1,0,2,5,3}，那么
     * 对应输出是重复的数字2或者3
     *
     * 思路：假设第i位数字为m，第m位的数字为n，如果m=n则说明m就是重复数字，如果m！=n，则将m和n
     * 调换位置，把m放在属于他的位置
     */
    public static int duplicate(int[] numbers,int length){
        int duplicateNum = -1;
        if(numbers == null || length == 0){
            return duplicateNum;
        }
        for(int num : numbers){
            if(num < 0 || num > length-1){
                return -1;
            }
        }
        for(int i=0;i<length;i++){
            while (numbers[i] != i){
                if(numbers[i] == numbers[numbers[i]]){
                    return numbers[i];
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return duplicateNum;
    }



}
