/**
 * @author Smartloe
 * @create 2023-05-11 10:42
 */
public class Mi {
    /*类Mi
      成员变量 double型diShu,zhiShu
      含参构造方法Mi(double a,double b)
      输出方法shuChu(),按幂的形式输出结果，如 2^4
      获取底数方法getDiShu(),返回幂的底数
      获取指数方法getZhiShu(),返回幂的指数
      muti(Mi r) 计算同底数幂的乘法，指数相加；底数不同，报错
      div(Mi r) 计算同底数幂的除法，指数相减；底数不同，报错
      power(Mi r) 计算同底数幂的乘方
    */
    double diShu, zhiShu;
//---begin---

    //【代码】声明double型变量diShu,zhiShu
    public Mi(double a, double b) {
        diShu = a;
        zhiShu = b;
    }
//【代码】含参构造方法，将参数赋值给变量diShu,zhiShu

    double getDiShu() {
        return diShu;
    }

    double getZhiShu() {
        return zhiShu;
    }

    void shuChu() {
        if (diShu == 0) {
            System.out.print(0);
        } else if (zhiShu == 0) {
            System.out.print(1);
        } else if (diShu < 0 && zhiShu > 0) {
            System.out.print("(" + diShu + ")" + "^" + zhiShu);
        } else if (diShu > 0 && zhiShu < 0) {
            System.out.print(diShu + "^" + "(" + zhiShu + ")");
        } else if (zhiShu < 0 && diShu < 0) {
            System.out.print("(" + diShu + ")" + "^" + "(" + zhiShu + ")");
        } else {
            System.out.print(diShu + "^" + zhiShu);
        }
    }

    Mi muti(Mi r) {//同底数幂的乘法运算
        if (diShu == r.getDiShu()) {
            return new Mi(diShu, zhiShu + r.getZhiShu());
        } else {
            System.out.println("底数不同，无法进行乘法运算");
            return null;
        }
    }


    Mi div(Mi r) {//同底数幂的除法运算
        if (diShu == r.getDiShu()) {
            return new Mi(diShu, zhiShu - r.getZhiShu());
        } else {
            System.out.println("底数不同，无法进行除法运算");
            return null;
        }
    }

    Mi power(double r) {//同底数幂的乘方运算
        return new Mi(diShu, zhiShu * r);
    }
}


class MainClass2 {

    public static void main(String[] args) {
        Mi r1 = new Mi(4, 4);
        Mi r2 = new Mi(4, 2);
        double r = 3;
        System.out.println("幂的乘法");
        Mi Result = r1.muti(r2);
        Result.shuChu();
        System.out.println("\n幂的除法");
        Result = r1.div(r2);
        Result.shuChu();
        System.out.println("\n幂的乘方");
        Result = r1.power(r);
        Result.shuChu();
    }

}
