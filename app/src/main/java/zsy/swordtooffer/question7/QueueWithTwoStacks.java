package zsy.swordtooffer.question7;

import java.util.Stack;

//用两个栈实现队列
public class QueueWithTwoStacks {

    /**
     * 题目：用两个栈实现队列。请实现它的两个函数appendTail和deleteHead,分别完成在队列
     * 尾部插入节点和在队列头部删除节点的功能
     * */

    /**
     * 思路：使用两个栈，当调用appendTail时，压入stack1中，当调用deleteHead时进行判断
     * 如果stack2中有数据则直接出栈，如果stack2中无数据而stack1中有数据，则将stack1中
     * 的数据全部压入stack2，再从stack2出栈。
     * */
    private static Stack<String> stack1 = new Stack<>();
    private static Stack<String> stack2 = new Stack<>();

    public static void appendTail(String append){
        stack1.push(append);
    }

    public static String deleteHead() throws Exception {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("queue is empty");
        }
        return stack2.pop();
    }

}
