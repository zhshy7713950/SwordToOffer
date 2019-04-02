package zsy.swordtooffer;

import org.junit.Test;

import zsy.swordtooffer.question1.DuplicationInArray;

public class Question1Test {

    @Test
    public void main(){
        int numbers[] = {2,3,1,0,2,5,3};
        System.out.println(DuplicationInArray.duplicate(numbers,numbers.length));
    }

}
