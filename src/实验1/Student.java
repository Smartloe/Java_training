package 实验1;

import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-04-27 11:07
 */
public class Student {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入姓名(回车确认):");
        // 【代码1】从键盘为name赋值
        String name = reader.nextLine();
        System.out.println("输入年龄(回车确认):");
        // 【代码2】从键盘为age赋值
        int age = reader.nextInt();
        System.out.println("输入身高(回车确认):");
        // 【代码3】从键盘为height赋值
        double height = reader.nextDouble();
        System.out.printf("%28s\n", "--基本信息--");
        System.out.printf("%10s%-10s", "姓名:", name);
        System.out.printf("%4s%-4d", "年龄:", age);
        System.out.printf("%4s%-4.2f", "身高:", height);
    }
}
