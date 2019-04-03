package zsy.swordtooffer.question3;
//替换字符串空格
public class ReplaceSpaces {

    /**
     * 题目：请实现一个函数，把字符串中的每个空格替换成"%20"。例如，输入"We are family."
     * 则输出"We%20are%20family."
     *
     * 思路：可以先遍历一遍，找出空格个数，计算出替换后字符串长度。使用两个下标，一个是原字符串
     * 末尾下标，一个是替换后字符串下标。遇到空格进行替换
     * */
    public static void replaceBlank(char[] str,int length){
        if(str == null || length <= 0){
            return;
        }
        int newLength;
        int originalLength = 0;
        int blankNum = 0;
        int i = 0;
        while (str[i] > 0){
            originalLength++;
            if(str[i] == ' ')
                blankNum++;
            i++;
        }
        newLength = originalLength + blankNum*2;//计算长度
        if(newLength > length){
            return;
        }
        int indexOfOriginal = originalLength;
        int indexOfNew = newLength;
        while (indexOfOriginal >= 0 && indexOfNew > 0){
            if(str[indexOfOriginal] == ' '){
                str[indexOfNew--] = '0';
                str[indexOfNew--] = '2';
                str[indexOfNew--] = '%';
            }else{
                str[indexOfNew--] = str[indexOfOriginal];
            }
            indexOfOriginal--;
        }
    }


}
