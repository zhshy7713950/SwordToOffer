package zsy.swordtooffer;

import org.junit.Test;

import zsy.swordtooffer.question5.ConstructBinaryTree;
import zsy.swordtooffer.question5.TreeNode;
import zsy.swordtooffer.question6.NextNodeInBinaryTree;

public class Question5_6Test {

    @Test
    public void main(){
        int[] preOrder={1,2,3,4,5,6,7,8,9};
        int[] inOrder={3,2,5,4,6,1,8,7,9};
        //Question5
        TreeNode node = ConstructBinaryTree.construct(preOrder,inOrder);
        printTreeNode(node);
        //Question6
        TreeNode pNode = getNode(node,8);
        TreeNode nextNode = NextNodeInBinaryTree.getNext(pNode);
        System.out.println("\n" + nextNode.value);
    }
    //查找  待优化
    private TreeNode getNode(TreeNode node,final int value){
        if(node == null){
            return null;
        }
        TreeNode pNode;
        if(node.value == value){
            pNode = node;
        }else if ((pNode = getNode(node.leftNode,value)) != null){

        }else if((pNode = getNode(node.rightNode,value)) != null){

        }
        return pNode;
    }

    //前序遍历打印
    private void printTreeNode(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        printTreeNode(node.leftNode);
        printTreeNode(node.rightNode);
    }
}
