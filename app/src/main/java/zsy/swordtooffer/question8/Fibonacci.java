package zsy.swordtooffer.question8;
//斐波那契数列
public class Fibonacci {

    /**
     * 题目：青蛙跳台阶问题
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级台阶总共有多少种跳法
     * */

    /**
     * 思路：典型的斐波那契数列问题f(n)=f(n-1)+f(n-2)
     * */

    //递归实现
    public static int fibonacciByRecursive(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return fibonacciByRecursive(n-1) + fibonacciByRecursive(n - 2);
    }

    //循环实现
    public static int fibonacci(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int fibOne = 1;
        int fibTwo = 2;
        int num = 0;
        for(int i=3;i<=n;i++){
            num = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = num;
        }
        return num;
    }
}
