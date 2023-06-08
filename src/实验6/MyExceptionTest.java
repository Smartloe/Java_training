package 实验6; /**
 * @author Smartloe
 * @create 2023-06-01 10:16
 */

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String m) {
        super(m);
    }
}

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            /********** Begin *********/
            if (num > 0) {
                System.out.println("The number you entered is: " + num);
            } else {
                throw new MyException("Number cannot be negative!");
            }

            /********** End *********/
        } catch (MyException e) {
            System.out.print(e);
        }
    }
}