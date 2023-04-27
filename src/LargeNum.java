///**
// * @author Smartloe
// * @create 2023-04-27 11:08
// */
public class LargeNum {
    public static void main(String args[]) {
        int a[] = {9, 9, 7, 3, 3, 4, 5, 9, 6, 7, 8, 9, 0, 8, 9, 9};
        int b[] = {5, 9, 8, 8, 0, 7, 9, 0, 8, 0, 8, 0, 8, 7, 6, 5, 5, 4, 4, 8};
        // int a[] = {1,0,3};
        // int b[] = {1,2,3};
        int x[] = null, z[] = null, flag = 0, k = 0;
        int i = 0, l = 0, result = 0;
        // 1. 首先输出两个大数a和b的值。
        for (int j : a) {
            System.out.printf("%d", j);
        }
        System.out.printf("\n减去:\n");
        for (int j : b) {
            System.out.printf("%d", j);
        }
        //---begin---
        if (a.length >= b.length) {
            x = a;
            z = b;
        } else {
            x = b;
            z = a;
            flag = -1;
        }

    }
}

