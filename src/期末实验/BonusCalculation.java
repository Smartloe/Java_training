package 期末实验;


import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lirun = scanner.nextDouble();
        double bonus = 0;
        if (lirun <= 10) {
            bonus = lirun * 0.1;
        } else if (lirun <= 20) {
            bonus = 10 * 0.1 + (lirun - 10) * 0.075;
        } else if (lirun <= 40) {
            bonus = 10 * 0.1 + 10 * 0.075 + (lirun - 20) * 0.05;
        } else if (lirun <= 60) {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (lirun - 40) * 0.03;
        } else if (lirun <= 100) {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (lirun - 60) * 0.015;
        } else {
            bonus = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (lirun - 100) * 0.01;
        }
        System.out.print("当月利润为" + lirun + "万元");
        System.out.println("，应发奖金" + bonus + "万元");
    }
}

