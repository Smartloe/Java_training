package 实验7;

/**
 * @author Smartloe
 * @create 2023-06-08 11:40
 */

import java.util.Scanner;

public class PhoneManage {
    /**
     * 参数 users
     * 新增用户信息
     */
    public void addPhone(User[] users, Scanner sc) {
        // 将键盘输入的用户信息存入用户对象中
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入手机号：");
        String telNum = sc.next();
        // 将对象放入对象数组中
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = new User(name, telNum);
                break;
            }
        }
    }

    /**
     * 参数 users
     * 查询通讯录列表
     */
    public void showPhone(User[] users) {
        for (User user : users) {
            if (user != null) {
                System.out.println(user.getName() + "\t" + user.getTel());
            }
        }
    }


    /**
     * 参数 users
     * 删除通讯录用户信息
     */
    public void deletePhone(User[] users, Scanner sc) {
        // 获取键盘输入的用户名
        System.out.println("请输入姓名：");
        String uname = sc.next();
        // 根据用户名查找该用户，最后将该用户从用户对象数组中删除
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && uname.equals(users[i].getName())) {
                users[i] = null;
            }
        }
        System.out.println("删除成功！");
    }

    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码

    /********** Begin **********/
    public void changePhone(User[] users, Scanner sc) {
        // 获取要修改用户的名称
        System.out.println("请输入你要修改用户的名称：");
        String name = sc.next();
        System.out.println("请输入新电话：");
        String newNum = sc.next();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName().equals(name)) {
                users[i].setTel(newNum);
                System.out.println("修改成功！");
                break;
            }
        }
    }

    /********** End **********/
}
