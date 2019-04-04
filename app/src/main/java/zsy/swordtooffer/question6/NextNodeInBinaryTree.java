package zsy.swordtooffer.question6;

import zsy.swordtooffer.question5.TreeNode;

//二叉树的下一个节点
public class NextNodeInBinaryTree {

    /**
     * 题目：给定一棵二叉树和其中的一个节点，如何找出中序遍历序列的下一个节点？
     * 树中的节点除了有两个分别指向左、右子节点的指针，还有一个指向父节点的指针
     * */

    /**
     * 思路：
     * 1、一个节点有右子树，那他的下一个节点就是他的右子树中的最左子节点
     * 2、一个节点没有右子树
     *    a、如果节点是他父节点的左子节点，那么下一个就是他的父节点
     *    b、节点是他父节点的右子节点，那么需要向上遍历，需要找到一个节点是他父节点的
     *    左子节点。那么这个节点的父节点就是下一个。
     * */
    public static TreeNode getNext(TreeNode pNode){
        if(pNode == null){
            return null;
        }
        TreeNode nextNode = null;
        if(pNode.rightNode != null){
            TreeNode rightNode = pNode.rightNode;
            while (rightNode.leftNode != null){
                rightNode = rightNode.leftNode;
            }
            nextNode = rightNode;
        }else if(pNode.parentNode != null){
            TreeNode curNode = pNode;
            TreeNode parentNode = pNode.parentNode;
            /**
             * 如果当前节点是父节点的右子节点，则需要继续向上遍历，
             * 直到找到当前节点是父节点的左子节点的节点。此节点的父节点就是下个节点
             */
            while (parentNode != null && curNode == parentNode.rightNode){
                curNode = parentNode;
                parentNode = parentNode.parentNode;
            }
            nextNode = parentNode;
        }
        return nextNode;
    }

}
