package 期末实验;

import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-06-15 11:12
 */
public class UrbanPropaganda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String city1 = "重庆";
        String city2 = "桂林";
        String city3 = "北京";

        if (str.equals(city1)) {
            System.out.println("行千里，致广大！");
        } else if (str.equals(city2)) {
            System.out.println("桂林山水甲天下！");
        } else if (str.equals(city3)) {
            System.out.println("北京欢迎您！");
        } else {
            System.out.println("重庆雄起！");
        }
    }
}
