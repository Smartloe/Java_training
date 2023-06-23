
package 模拟快递柜;

import java.util.Scanner;

public class MenuInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("请选择您的身份：1.快递员 2.用户 3.退出");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("请选择您的操作：1.快递录入 2.快递删除 3.查看所有快递 4.返回上一级菜单");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("请输入快递编号：");
                        String id = scanner.next();
                        System.out.println("请输入快递公司：");
                        String company = scanner.next();
                        String code = generateCode();
                        System.out.println("生成的取件码为：" + code);
                        //TODO:将快递信息存入数据库
                        break;
                    case 2:
                        System.out.println("请输入要删除的快递编号：");
                        String deleteId = scanner.next();
                        //TODO:从数据库中删除对应快递信息
                        break;
                    case 3:
                        //TODO:查询数据库中所有快递信息并输出
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("输入有误，请重新输入！");
                        break;
                }
            } else if (choice == 2) {
                System.out.println("请选择您的操作：1.取件 2.寄件 3.返回上一级菜单");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("请输入取件码：");
                        String code = scanner.next();
                        //TODO:查询数据库中对应快递信息并输出
                        break;
                    case 2:
                        System.out.println("请输入目的地：");
                        String destination = scanner.next();
                        System.out.println("请输入重量：");
                        double weight = scanner.nextDouble();
                        double price = getPrice(destination, weight);
                        System.out.println("快递费用为：" + price);
                        System.out.println("请选择支付方式：1.到付 2.寄付");
                        int payChoice = scanner.nextInt();
                        if (payChoice == 1) {
                            System.out.println("请将快递费用" + price + "元交给快递员");
                        } else if (payChoice == 2) {
                            String id = generateId();
                            System.out.println("您的快递单号为：" + id);
                            //TODO:将快递信息存入数据库
                        } else {
                            System.out.println("输入有误，请重新输入！");
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("输入有误，请重新输入！");
                        break;
                }
            } else if (choice == 3) {
                System.out.println("退出系统！");
                break;
            } else {
                System.out.println("输入有误，请重新输入！");
            }
        }
    }

    /**
     * 生成取件码
     *
     * @return 取件码
     */
    public static String generateCode() {
        //TODO:生成取件码的算法
        return "";
    }

    /**
     * 生成快递单号
     *
     * @return 快递单号
     */
    public static String generateId() {
        //TODO:生成快递单号的算法
        return "";
    }

    /**
     * 获取快递费用
     *
     * @param destination 目的地
     * @param weight      重量
     * @return 快递费用
     */
    public static double getPrice(String destination, double weight) {
        //TODO:根据目的地和重量计算快递费用
        return 0;
    }
}


