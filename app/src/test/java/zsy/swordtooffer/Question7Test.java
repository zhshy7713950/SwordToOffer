package zsy.swordtooffer;

import org.junit.Test;

import zsy.swordtooffer.question7.QueueWithTwoStacks;

public class Question7Test {

    @Test
    public void main(){
        try {
            QueueWithTwoStacks.appendTail("how");
            QueueWithTwoStacks.appendTail("are");
            QueueWithTwoStacks.appendTail("you");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
            QueueWithTwoStacks.appendTail("!");
            QueueWithTwoStacks.appendTail("Fine!");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
            QueueWithTwoStacks.appendTail("Thank you!");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
            QueueWithTwoStacks.appendTail("And you?");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
            System.out.print(QueueWithTwoStacks.deleteHead() + " ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
