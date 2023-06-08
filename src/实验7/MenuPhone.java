package 实验7;

/**
 * @author Smartloe
 * @create 2023-06-08 11:48
 */

import java.util.Scanner;

// 此类为整个通讯录的总控制，负责启动
public class MenuPhone {

    public static void main(String[] args) {

        User[] users = new User[50]; // 创建一个对象数组，用于存放所有的通讯录信息
        // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
        /********** Begin **********/
        // 实例化 Scanner 对象
        Scanner sc = new Scanner(System.in);
        // 实例化 PhoneManage 对象
        PhoneManage pm = new PhoneManage();
        while (true) {
            System.out.println("通讯录信息管理页面");
            System.out.println("**********");
            System.out.println("1.新增");
            System.out.println("2.查看");
            System.out.println("3.删除");
            System.out.println("4.修改");
            System.out.println("5.退出");
            System.out.println("**********");
            System.out.println("请输入选择的操作：");
            // 获取键盘输入
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pm.addPhone(users, sc);
                    break;
                case 2:
                    pm.showPhone(users);
                    break;
                case 3:
                    pm.deletePhone(users, sc);
                    break;
                case 4:
                    pm.changePhone(users, sc);
                    break;
                case 5:
                    System.out.println("退出成功！");
                    return;
                default:
                    System.out.println("选择错误！");
                    break;
            }
        }
        /********** End **********/
    }
}


