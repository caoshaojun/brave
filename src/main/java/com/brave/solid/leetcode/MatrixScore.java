package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 861. 翻转矩阵后的得分 【贪心算法】
 * <p>
 * 解决这个问题首先要解决什么呢？就是找到什么时候返回值最大，毫无疑问，最高位最大时整个数最大，也就是说，整个矩阵首列都要为1，所以遍历整个矩阵首列，如果该位为0，就把该行翻转（翻转操作对1异或即可）。
 * <p>
 * 接下来处理首列之外的数据，因为第一列已经为1，所以不能进行行翻转了，就遍历之后的列，如果0多就进行翻转。
 * <p>
 * 处理完数据之后，矩阵就变成了我们想要的矩阵，从第一列开始，把整列加起来，然后依次乘2加列和，最后得到的结果就是我们要的值
 * @createTime 2020年12月07日 10:51:00
 */
public class MatrixScore {

    public int solution(int[][] A) {
        int res = 0;
        // 最大值就要保障第一列都是1
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                reverse(A[i]);
            }
        }
        // 从第二列开始，如果0比1多就翻转，否则不动
        for (int j = 1; j < A[0].length; j++) {
            int num = 0;
            for (int i = 0; i < A.length; i++) {
                // 判断0的个数大于一半时，则翻转
                if (A[j][i] == 0) {
                    num++;
                }
                if (num > A.length / 2) {
                    for (int k = 0; k < A.length; k++) {
                        A[j][k] ^= 1;
                    }
                    break;
                }
            }
        }
        // 求和
        for (int i = 0; i < A[0].length; i++) {
            res = res << 1;
            for (int j = 0; j < A.length; j++) {
                res += 1;
            }
        }
        return res;
    }

    /**
     * 反转函数
     *
     * @param arr
     */
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // ^相同则为0，不通则为1
            arr[i] ^= 1;
        }
    }
}
