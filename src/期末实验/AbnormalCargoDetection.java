
package 期末实验;

/**
 * @author Smartloe
 * @create 2023-06-15 10:23
 */

import java.util.Scanner;

//Goods类,包含商品名称和危化品属性
class Goods {
    boolean isDanger;
    String name;

    public Goods() {
    }

    public Goods(String name, boolean isDanger) {
        this.isDanger = isDanger;
        this.name = name;
    }

    public void setIsDanger(boolean boo) {
        isDanger = boo;
    }

    public boolean isDanger() {
        return isDanger;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}

//-----begin------
//定义危险品异常类DangerException
//成员变量：字符串型 message并赋初值为"危险品！"
//toShow()方法，输出 message
class DangerException extends Exception {
    String message = "危险品！";

    public void toShow() {
        System.out.print(message);
    }
}

//-----end-----

//-----begin------
//定义安检机器类Machine
//检测货物checkBag(Goods)方法，如果当前货物是危险品，抛出危险品异常DangerException
//否则输出：XX不是危险品！
class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            throw new DangerException();
        } else {
            System.out.print(goods.getName() + "不是危险品！");
        }
    }
}

//-----end-----


public class AbnormalCargoDetection {
    public static void main(String args[]) {
        Machine machine = new Machine();
        String name[] = {"苹果", "炸药", "西服", "硫酸", "手表", "硫磺"};
        Goods[] goods = new Goods[name.length];
        for (int i = 0; i < name.length; i++) {
            goods[i] = new Goods();
            if (i % 2 == 0) {
                goods[i].setIsDanger(false);
                goods[i].setName(name[i]);
            } else {
                goods[i].setIsDanger(true);
                goods[i].setName(name[i]);
            }
        }


        Scanner sc = new Scanner(System.in);
        String newName = sc.next();
        Goods newGood = new Goods();
        for (Goods i : goods) {
            if (i.getName().equals(newName)) {
                boolean newDanger = i.isDanger();
                newGood = new Goods(newName, newDanger);
            }
        }
        //-----begin------
        //try-catch 语句
        //机器调用checkBag()方法检测newGood，如果是危险品异常，调用toShow()方法，并输出：XX被禁止！
        //否则输出：XX检查通过
        try {
            machine.checkBag(newGood);
            System.out.println(newGood.getName() + "检查通过");
        } catch (DangerException e) {
            e.toShow();
            System.out.println(newGood.getName() + "被禁止！");
        }

        //-----end-----
    }
}


