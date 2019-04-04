package zsy.swordtooffer.question5;
//重建二叉树
public class ConstructBinaryTree {

    /**
     * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历结果
     * 中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
     * 则重建出二叉树并输出他的根节点。
     * */

    /**
     * 思路：在二叉树的前序遍历中，第一个数字总是树的根节点。在中序遍历中，树的根节点在序列的中间，
     * 左子树的节点的值位于根节点的左边，右子树节点的值位于根节点值的右边。
     *
     * 因此需要扫描中序遍历序列才能找到很结点的值，由此可以找到左子树的节点的个数和右子树节点的个数，
     * 然后在前序遍历序列中找到左子树的根节点，再到中序遍历序列中找到左子树的左子树和右子树。依次递归。
     * 由于二叉树的构造本身就是用递归实现的，所以重建二叉树也用递归进行实现实很简单的。
     * */
    public static TreeNode construct(int[] perOrder,int[] inOrder){
        if(perOrder == null || inOrder == null || perOrder.length != inOrder.length || perOrder.length < 1){
            return null;
        }
        return construct(perOrder,0,perOrder.length-1,inOrder,0,inOrder.length-1,null);
    }
    /**
      * 根据前序遍历和中序遍历构建二叉树
      * @param perOrder    前序遍历序列
      * @param ps          前序遍历开始位置
      * @param pe          前序遍历结束位置
      * @param inOrder     中序遍历序列
      * @param is          中序遍历开始位置
      * @param ie          中序遍历结束位置
      * @return            构建的树的根节点
     */
    public static TreeNode construct(int[] perOrder, int ps, int pe, int[] inOrder, int is, int ie,TreeNode parentNode) {
        //开始位置大于结束位置说明已经处理到叶节点了
        if(ps > pe){
            return null;
        }
        //前序遍历的第一个数字是跟节点
        int rootValue = perOrder[ps];
        //indexIn为根节点在中序遍历序列中的索引
        int indexIn = is;
        while (indexIn <= ie && inOrder[indexIn] != rootValue){
            indexIn++;
        }
        //在中序遍历中未找到，抛出异常
        if(indexIn > ie){
            throw new RuntimeException("invalid input " + indexIn);
        }
        TreeNode rootNode = new TreeNode();
        rootNode.value = rootValue;
        int leftLength = indexIn - is;
        //计算出根节点左侧子节点个数，左侧节点的结束下标pe则是ps+leftLength
        //左子树对应的前序遍历位置在perOrder[ps+1,ps+leftLength]
        //左子树对应的中序遍历位置在inOrder[is,indexIn-1]
        rootNode.leftNode = construct(perOrder,ps+1,ps+leftLength,inOrder,is,indexIn-1,rootNode);
        //右子树对应的前序遍历位置在perOrder[ps+1+leftLength,pe]
        //右子树对应的中序遍历位置在inOrder[indexIn+1,ie]
        rootNode.rightNode = construct(perOrder,ps+1+leftLength,pe,inOrder,indexIn+1,ie,rootNode);
        rootNode.parentNode = parentNode;
        return rootNode;
    }

}
