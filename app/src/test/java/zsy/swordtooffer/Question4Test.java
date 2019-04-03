package zsy.swordtooffer;

import org.junit.Test;

import java.util.Random;

import zsy.swordtooffer.question4.ListNode;
import zsy.swordtooffer.question4.PrintListInReversedOrder;

public class Question4Test {

    @Test
    public void main(){
        ListNode header = buildList();
        printList(header);
        System.out.print("\n");
        PrintListInReversedOrder.printListByStack(header);
        System.out.print("\n");
        PrintListInReversedOrder.printListByRecursive(header);
    }

    private void printList(ListNode header){
        if(header != null){
            ListNode pNode = header;
            while (pNode != null){
                System.out.print(pNode.getKey()+" ");
                pNode = pNode.getNextNode();
            }
        }
    }

    private ListNode buildList(){
        Random random = new Random();
        ListNode header = new ListNode(random.nextInt(100),null);
        ListNode perNode = header;
        for(int i=1;i<10;i++){
            ListNode node = new ListNode(random.nextInt(100),null);
            perNode.setNextNode(node);
            perNode = node;
        }
        return header;
    }
}
