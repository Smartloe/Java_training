package 实验2;

import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-05-04 11:02
 */
public class Number {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入一个 1 至 99999 之间的数");
        int len = 1;
        int temp1;
        int temp2;
        int sum = 0;
        int number = reader.nextInt();
//---begin---
        //复制两份
        temp1 = number;
        temp2 = number;
        //先获取数字的长度
        while (temp1 / 10 != 0) {
            temp1 = temp1 / 10;
            len++;
        }

        while (number != 0) {
            int n = number % 10;
            number /= 10;
            sum = sum * 10 + n;
        }
        if (sum == temp2) {
            System.out.printf("%d是%d位数%d是回文数", temp2, len, temp2);
        } else {
            System.out.printf("%d是%d位数%d不是回文数", temp2, len, temp2);
        }

//---end---
        reader.close();
    }
}
