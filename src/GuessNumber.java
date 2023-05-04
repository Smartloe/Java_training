import javax.swing.*;
import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-05-04 10:47
 */
public class GuessNumber {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int realNumber = reader.nextInt();
        System.out.println("输入您的猜测:");
        int yourGuess = reader.nextInt();
//----begin----
        while (true) {
            if (realNumber > yourGuess) {
                System.out.println("猜小了,再输入你的猜测:");

            } else if (realNumber < yourGuess) {
                System.out.println("猜大了,再输入你的猜测:");
            } else {
                System.out.println("猜对了!");
                break;
            }
            yourGuess = reader.nextInt();
        }
//----end----
        reader.close();
    }
}

