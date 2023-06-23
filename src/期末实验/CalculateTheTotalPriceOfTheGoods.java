package 期末实验;

import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-06-15 10:46
 */
public class CalculateTheTotalPriceOfTheGoods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double price1 = sc.nextDouble();
        int num2 = sc.nextInt();
        double price2 = sc.nextDouble();

        Commodity all_price1 = new Commodity();
        System.out.println("购买百货花费" + all_price1.Commodity(num1, price1));

        Electric all_price2 = new Electric();
        System.out.println("购买电器花费：" + all_price2.Electric(num2, price2));

        System.out.println("所购商品总价为：" + (all_price1.Commodity(num1, price1) + all_price2.Electric(num2, price2)));

    }
}

interface InterfaceGoods {
    double getPrice();
}

//这里其实是个Goods，为避免冲突换成了Commodities
class Commodities {
    int amount;
    double price;

    //实现接口
    public double getPrice(int a, int b) {
        return amount * price;
    }
}

//百货类
class Commodity extends Commodities {
    double Commodity(int q, double p) {
        return q * p * 0.8;
    }
}

//电器类
class Electric extends Commodities {
    double Electric(int q, double p) {
        return q * p * 0.9;
    }
}