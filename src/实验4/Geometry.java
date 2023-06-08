package 实验4;

/**
 * @author Smartloe
 * @create 2023-05-18 10:30
 */
/*
  抽象类Geometry
  包含抽象方法 计算面积getArea()
 */
abstract class Geometry {
    public abstract double getArea();
}



/*
 抽象类Geometry非抽象子类Circle圆
 成员变量：半径double r
 含参构造方法Circle(double r)设置半径
 重写抽象方法getArea()计算圆的面积
 */

//----begin----
class Circle extends Geometry {
    private double radius; // 圆的半径

    public Circle(double radius) {
        this.radius = radius;
    }

    // 返回圆的面积
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

//----end----

/*
抽象类Geometry非抽象子类Rect矩形
成员变量：底和高 double a,b
含参构造方法Rect(double a, double b)设置底和高
重写抽象方法getArea()计算矩形的面积
*/
//----begin----
class Rect extends Geometry {
    private double a, b; // 底和高

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // 返回矩形的面积
    @Override
    public double getArea() {
        return a * b;
    }
}
//----end----

/*
类TotalArea
成员变量：几何图形数组 tuxing[],几何图形总面积double totalArea
方法setTuxing(Geometry[] t)几何图形数组
方法computerTotalArea()用循环语句让几何图形数组tuxing 的元素调用 getArea()方法计算对应元素形状的面积，并将返回的值累加到 totalArea
*/
class TotalArea {
    Geometry[] tuxing;
    double totalArea = 0;

    public void setTuxing(Geometry[] t) {
        tuxing = t;
    }

    public double computerTotalArea() {
        //----begin----
        // 对几何图形数组的每个元素调用 getArea()方法计算面积并累加到 totalArea 中
        for (int i = 0; i < tuxing.length; i++) {
            totalArea += tuxing[i].getArea();
        }
        //----end----
        return totalArea;
    }
}

class MainClass {
    public static void main(String args[]) {
        Geometry[] tuxing = new Geometry[29]; // 有 29 个 Geometry 对象
        for (int i = 0; i < tuxing.length; i++) { // 29 个 Geometry 对象分成两类
            if (i % 2 == 0) {
                tuxing[i] = new Rect(16 + i, 68);
            } else if (i % 2 == 1) {
                tuxing[i] = new Circle(10 + i);
            }
        }
        TotalArea computer = new TotalArea();
        computer.setTuxing(tuxing);
        System.out.printf("各种图形的面积之和:\n%f", computer.computerTotalArea());
    }
}

