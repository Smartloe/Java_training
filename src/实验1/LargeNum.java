package 实验1;

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
        for (int j : a) {
            System.out.printf("%d", j);
        }
        System.out.printf("\n减去:\n");
        for (int j : b) {
            System.out.printf("%d", j);
        }

        //---begin---

        for (i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for (i = 0; i < b.length / 2; i++) {
            int temp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = temp;
        }


        if (a.length >= b.length) {
            x = a;
            z = b;
        } else {
            x = b;
            z = a;
            flag = -1;
        }
        int c[] = new int[x.length];
        for (i = 0; i < x.length; i++) {
            if (i < z.length) {
                result = x[i] - z[i];
            } else {
                result = x[i];
            }
            if (result < 0) {
                x[i + 1]--;
                result += 10;
            }
            c[i] = result;
        }

// 保存数组结果
        for (i = 0; i < c.length / 2; i++) {
            int temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }
        //---end---


        System.out.printf("\n等于:\n");
        if (flag == 0) {
            System.out.printf("%d", 0);
        } else {
            if (flag < 0) {
                System.out.printf("-");
            }
            for (i = 0; i < c.length; i++) {
                if (c[i] != 0) {
                    k = i;
                    break;
                }
            }
            for (i = k; i < c.length; i++) {
                System.out.printf("%d", c[i]);

            }
        }
    }
}
