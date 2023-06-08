package 实验5;

/**
 * @author Smartloe
 * @create 2023-05-25 10:50
 */
//*********begin************
//定义接⼝A，⾥⾯包含值为3.14的常量PI和抽象⽅法double area()
interface A {
    double PI = 3.14;

    double area();
}

//定义接⼝B，⾥⾯包含抽象⽅法void setColor(String c)
interface B {
    void setColor(String c);
}

//定义接⼝C，该接⼝继承了接⼝A和B，⾥⾯包含抽象⽅法void volume()
interface C extends A, B {
    void volume();
}


//*********end************

/*
 * 定义圆柱体类Cylinder实现接⼝C，该类中包含三个私有成员变量：底圆半径radius、圆柱体的⾼height、颜⾊color
 * 构造方法Cylinder(double radius, double height, String color)
 * setColor(String c)方法设置颜色
 * getColor()方法返回颜色
 */

class Cylinder implements C {
    private double radius;
    private double height;
    private String color;

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    //*********begin************
    //重写接口方法

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void volume() {
        System.out.println("圆柱体的体积为：" + radius * radius * PI * height);
    }

    //*********end************


}

//创建主类GraphicArea
public class GraphicArea {
    public static void main(String[] agrs) {
        //*********begin************
        System.out.println("test c1:");
        A c1 = new Cylinder(1, 1, "red");
        //输出c1的底面面积和颜色
        System.out.println("面积：" + c1.area());
        System.out.println(((Cylinder) c1).getColor());

        System.out.println("test c2:");
        B c2 = new Cylinder(2, 2, "blue");
        //输出c2的底面面积和颜色
        System.out.println("面积：" + ((Cylinder) c2).area());
        System.out.println(((Cylinder) c2).getColor());

        //设置c2颜色为：green
        //输出c2的颜色
        ((Cylinder) c2).setColor("green");
        System.out.println(((Cylinder) c2).getColor());

        System.out.println("test c3:");
        C c3 = new Cylinder(1, 2, "blank");
        //输出c3的底面面积、体积和颜色
        System.out.println("面积：" + c3.area());
        c3.volume();
        System.out.println(((Cylinder) c3).getColor());
        //*********end************
    }
}