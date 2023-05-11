/**
 * @author Smartloe
 * @create 2023-05-11 10:09
 */
public class Tank {
    //---begin---
    //【代码 1】包含两个变量double 型变量 speed,刻画速度
    double speed;
    //【代码 2】int 型变量 bulletAmount,刻画炮弹数量
    int bulletAmount;

    //speedUp(int s) 加速方法，将 s+speed 赋值给 speed
    public void speedUp(int s) {
        speed += s;
    }

    //speedDown(int d) 加速方法，将 speed-d 赋值给 speed,如果速度 speed-d<0,不再减速，速度设定为0
    public void speedDown(int d) {
        speed -= d;
    }

    void setBulletAmount(int m) {
        bulletAmount = m;
    }

    int getBulletAmount() {
        return bulletAmount;
    }

    double getSpeed() {
        return speed;
    }

    //fire() 开火方法，每开一次，输出：打出一发炮弹，且炮弹数量bulletAmount减1。
//如果炮弹数量低于1，输出：没有炮弹了,无法开火
    public void fire() {
        bulletAmount--;
        if (bulletAmount < 1) {
            System.out.println("没有炮弹了,无法开火");
        } else {
            System.out.println("打出一发炮弹");
        }
    }
    //---end---
}


class Fight {
    public static void main(String args[]) {
        Tank tank1, tank2;
        tank1 = new Tank();
        tank2 = new Tank();
        tank1.setBulletAmount(10);
        tank2.setBulletAmount(10);
        System.out.println("tank1 的炮弹数量： " + tank1.getBulletAmount());
        System.out.println("tank2 的炮弹数量： " + tank2.getBulletAmount());
        tank1.speedUp(80);
        tank2.speedUp(90);
        System.out.println("tank1 目前的速度： " + tank1.getSpeed());
        System.out.println("tank2 目前的速度： " + tank2.getSpeed());
        tank1.speedDown(15);
        tank2.speedDown(30);
        System.out.println("tank1 目前的速度： " + tank1.getSpeed());
        System.out.println("tank2 目前的速度： " + tank2.getSpeed());
        System.out.println("tank1 开火： ");
        tank1.fire();
        System.out.println("tank2 开火： ");
        tank2.fire();
        tank2.fire();
        System.out.println("tank1 的炮弹数量： " + tank1.getBulletAmount());
        System.out.println("tank2 的炮弹数量： " + tank2.getBulletAmount());
    }
}