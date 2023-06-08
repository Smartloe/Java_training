package 实验6; /**
 * @author Smartloe
 * @create 2023-06-01 10:08
 */

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        /********* Begin *********/

        try
        {
            System.out.println(num1 / num2);
        }
        catch(Exception e){
            System.out.println("除数不能为0");
        }
        /********* End *********/
    }

}

