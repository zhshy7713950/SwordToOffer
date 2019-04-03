package zsy.swordtooffer.question4;

import java.util.Stack;

//从头到尾打印链表
public class PrintListInReversedOrder {

    /**
     * 题目：输入一个链表的头节点，从尾到头反过来打印每个节点的值。
     * */


    /*
    * 思路一：采用一个辅助栈
    * */
    public static void printListByStack(ListNode header){
        if(header == null){
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode pNode = header;
        while (pNode != null){
            stack.push(pNode);
            pNode = pNode.getNextNode();
        }
        while (!stack.empty()){
            System.out.print(stack.pop().getKey() + " ");
        }
    }

    /**
     * 思路二：递归
     * */
    public static void printListByRecursive(ListNode header){
        if(header == null){
            return;
        }
        printListByRecursive(header.getNextNode());
        System.out.print(header.getKey() + " ");
    }
}
