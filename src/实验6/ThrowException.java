package 实验6; /**
 * @author Smartloe
 * @create 2023-06-01 10:11
 */

import java.util.Scanner;

public class ThrowException {
    public static void function(String id) {  //利用throws关键字声明该方法可能出现异常IllegalArgumentException
        /********** Begin *********/
        if (id.length() == 7) {
            //输出ID合法时的语句
            System.out.println("ID格式正确：" + id);
        } else {
            //利用throw关键字抛出异常IllegalArgumentException
            throw new IllegalArgumentException();
        }
        /********** End *********/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        try {
            function(id);
        } catch (IllegalArgumentException e) {
            /********** Begin *********/
            //输出ID不合法时的语句
            System.out.println("ID长度应为7");


            /********** End *********/
        }
    }
}
