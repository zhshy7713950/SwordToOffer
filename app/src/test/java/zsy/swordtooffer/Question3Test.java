package zsy.swordtooffer;

import org.junit.Test;

import zsy.swordtooffer.question3.ReplaceSpaces;

public class Question3Test {

    @Test
    public void main(){
        char[] str = new char[30];
        String s = "We are family.";
        for(int i=0;i<s.length();i++){
            str[i] = s.charAt(i);
        }
        ReplaceSpaces.replaceBlank(str,str.length);
        for(char c : str){
            System.out.print(c);
        }
    }
}
