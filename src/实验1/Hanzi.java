package 实验1;

/**
 * @author Smartloe
 * @create 2023-04-27 11:05
 */
public class Hanzi {
    public static void main(String args[]) {
        char ch = '研', zifu = 0;
        int p = 22920, count = 5, position = 0;
        System.out.printf("输出%d个石字旁的汉字:\n", count);
        for (char c = ch; c <= ch + count; c++) {
            // 【代码1】c进行int型转换据运算，并将结果赋值给position
            position=(int)c;
            System.out.printf("%c(%d)", c, position);
        }
        System.out.printf("\n输出%d个女字旁的汉字:\n", count);
        for (int n = p; n <= p + count; n++) {
            // 【代码2】n做char型转换运算，并将结果赋值给zifu
            zifu=(char)n;
            System.out.printf("%c(%d)", (char)zifu, n);
        }
    }
}
