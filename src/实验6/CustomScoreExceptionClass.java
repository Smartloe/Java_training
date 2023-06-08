package 实验6; /**
 * @author Smartloe
 * @create 2023-06-01 10:23
 */

import java.util.*;

/*
 *自定义异常类，用于处理非法成绩数据
*/
class ScoreException extends Exception {
    public ScoreException(double m) {
        super("分数" + m + "是一个非法的成绩数据");
    }
}

public class CustomScoreExceptionClass {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        // 总分
        double sum = 0;
        // 成绩数量
        int m = 0;
        // 循环读取成绩
        while (reader.hasNextDouble()) {
            try {
                // 读取成绩
                double x = reader.nextDouble();
                // 判断成绩是否合法
                if (x > 100 || x < 0) {
                    // 抛出自定义异常
                    throw new ScoreException(x);
                }
                // 成绩数量加1
                m = m + 1;
                // 总分加上当前成绩
                sum = sum + x;
                // 捕获自定义异常
            } catch (ScoreException e) {
                // 输出异常信息
                System.out.println(e.getMessage());
            }
        }
        // 输出成绩数量和总分
        System.out.printf("%d个数的和为%f\n", m, sum);
        // 输出平均分
        System.out.printf("%d个数的平均值是%f\n", m, sum / m);
    }
}
