import com.sun.org.apache.xpath.internal.operations.Div;
import com.sun.org.apache.xpath.internal.operations.Minus;

/**
 * @author Smartloe
 * @create 2023-05-25 10:26
 */
/*
 * 接口ICompute
 * 抽象方法计算compute(double n,double m)
 */
interface ICompute {
    double compute(double n, double m);
}

//----begin----
/*
 * 加法类Add实现接口ICompute
 * 重写compute(double n,double m)方法，计算n+m的和并输出
 */
class Add implements ICompute {
    @Override
    public double compute(double n, double m) {
        System.out.println(n + "+" + m + "=" + (n + m));

        return n + m;
    }
}

/*
 * 减法类Minus实现接口ICompute
 * 重写compute(double n,double m)方法，计算 n-m的差并输出
 */
class Minus1 implements ICompute {
    @Override
    public double compute(double n, double m) {
        System.out.println(n + "-" + m + "=" + (n - m));
        return n - m;
    }
}

/*
 * 乘法类Mul实现接口ICompute
 * 重写compute(double n,double m)方法，计算 n*m的积并输出
 */
class Mul implements ICompute {
    @Override
    public double compute(double n, double m) {
        System.out.println(n + "*" + m + "=" + (n * m));
        return n * m;
    }
}

/*
 * 除法类Div实现接口ICompute
 * 重写compute(double n,double m)方法，计算 n/m的商并输出
 */
class Div1 implements ICompute {
    @Override
    public double compute(double n, double m) {
        System.out.println(n + "/" + m + "=" + (n / m));
        return n / m;
    }
}

/*
 * UseCompute类
 * useCom(ICompute com,double n,double m)方法，输入计算类型和要计算的数据 n,m, 输出对应的运算结果
 */
class UseCompute {
    public void useCom(ICompute com, double n, double m) {
        com.compute(n, m);
    }
}
//----end----

public class JiSuanQi {
    public static void main(String[] args) {
        UseCompute fun = new UseCompute();
        double m = 8, n = 2;
        fun.useCom(new Add(), m, n);
        fun.useCom(new Minus1(), m, n);
        fun.useCom(new Mul(), m, n);
        fun.useCom(new Div1(), m, n);
    }
}

