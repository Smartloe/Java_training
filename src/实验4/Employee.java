package 实验4; /**
 * @author Smartloe
 * @create 2023-05-18 10:50
 */

import java.util.Scanner;
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码

/********** Begin **********/
// 定义员工抽象类 Employee，其中包含 2 个受保护的变量和两个抽象方法
abstract class Employee {
    // 两个受保护的变量：姓名 name（String），和工资 salary（double）；
    protected String name;
    protected Double salary;

    //抽象方法 work，无返回值，表示工作内容
    public abstract void work();

    //抽象方法 info，无返回值，表示员工信息
    public abstract void info();
}

// 定义一个经理类 Manager，该类继承员工类，除了有员工类的基本属性外，还有岗位级别 gender（String）私有属性。
class Manager extends Employee {

    private String gender;

    // 定义一个有参构造方法
    public Manager(String name, Double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    // 重写 work() 方法，输出：“我负责对施工项目实施全过程、全面管理。”；
    @Override
    public void work() {
        System.out.println("我负责对施工项目实施全过程、全面管理。");
    }

    // 重写 info() 方法，输出：“姓名：xx，工资：xx，岗位级别：xx”。
    @Override
    public void info() {
        System.out.printf("姓名：%s，工资：%.1f，岗位级别：%s\n", this.name, this.salary, this.gender);

    }

}

/********** End **********/

class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager e1 = new Manager(sc.next(), sc.nextDouble(), sc.next());
        e1.info();
        e1.work();
    }
}

