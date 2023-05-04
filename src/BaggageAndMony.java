import java.util.Scanner;

/**
 * @author Smartloe
 * @create 2023-05-04 10:12
 */
public class BaggageAndMony {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("请输入托运方式:\n");
        String tyff = reader.next();
        double weight;
        System.out.printf("请输入行李重量(单位:公斤(kg)):\n ");
        weight = reader.nextDouble();
        System.out.println("您选择的托运方式为:" + tyff);
        System.out.printf("您的行李重量为:%f 公斤(kg)\n ", weight);
//----begin-----
        switch (tyff) {
            case "飞机":
                System.out.println("需要计费的重量:"+(int)Math.ceil(weight*1000)+"(g)");
                System.out.println("用飞机托运(0.0620元/g),费用:"+Math.ceil((weight*1000))*0.0620+"元");
                break;
            case "火车":
                System.out.println("需要计费的重量:"+(int)Math.ceil(weight)+"(kg)");
                System.out.printf("用火车托运(12元/kg),费用:%.2f元",Math.ceil(weight)*12);
                break;
        }
//----end----
    }
}

