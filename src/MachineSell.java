import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-05-04 11:36
 */
public class MachineSell {
    public static void main(String args[]) {
        int money, type;
        int drinkKind;
        boolean YesorNo;
        System.out.printf("投入金额:(回车确认):\n");
        Scanner reader = new Scanner(System.in);
        money = reader.nextInt();
        while (money > 0) {
            System.out.printf("选择那个价位的商品(单位：元)：2 or 3?\n");
            type = reader.nextInt();
            if (type == 2) {
                System.out.printf("选择净净矿泉水(1),甜甜矿泉水(2)和美美矿泉水(3)之一:\n");
                System.out.printf("输入 1,2 或 3:\n");
                drinkKind = reader.nextInt();
//---begin---
                switch (drinkKind) {//【代码】switch 语句:1-得到净净矿泉水, 2-得到甜甜矿泉水,3-得到美美矿泉水,default-选择错误
                    case 1:
                        System.out.println("得到净净矿泉水");
                        break;
                    case 2:
                        System.out.println("得到甜甜矿泉水");
                        break;
                    case 3:
                        System.out.println("得到美美矿泉水");
                        break;
                    default:
                        System.out.println("选择错误");
                }
//【代码】购买商品后价格更新
                money = money - type;
            } else if (type == 3) {
                System.out.printf("选择爽口可乐(1),清凉雪碧 (2),和雪山果汁(3)之一:\n");
                System.out.printf("输入 1,2 或 3:\n");
                drinkKind = reader.nextInt();
                switch (drinkKind) {//【代码】switch 语句:1-得到爽口可乐, 2-得到清凉雪碧,3-得到雪山果汁,default-选择错误
                    case 1:
                        System.out.println("得到爽口可乐");
                        break;
                    case 2:
                        System.out.println("得到清凉雪碧");
                        break;
                    case 3:
                        System.out.println("得到雪山果汁");
                        break;
                    default:
                        System.out.println("选择错误");
                }
//【代码】购买商品后价格更新
                money = money - type;
//                System.out.println(money);
            }
//---end---
            else {
                System.out.printf("无此价位商品\n");
            }
            System.out.printf("是否退出：true/false\n");
            YesorNo = reader.nextBoolean();
            if (YesorNo) {
                break;
            }
        }
        System.out.printf("找零：" + money + "元\n");
    }

}
