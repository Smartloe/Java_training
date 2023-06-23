
package 期末实验;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Student类
 * 私有成员变量：学号String ID、姓名String name、年龄 int age
 * 含参构造方法Student(String ID, String name, int age)设置学号、姓名、年龄
 * toString()方法按格式输出学生信息，如 Student{ID='01', name='张三', age=20}
 * getID()/setID()方法 获取/设置学号
 * getName()/setName()方法 获取/设置姓名
 * getAge()/setAge()方法 获取/设置年龄
 */
class Student {
    private String ID;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.将这些Student对象放进数组中
        Student[] students = getData();
        //2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
        System.out.println(Arrays.toString(students));
        System.out.println("请输入学生的姓名：");
        String name = scanner.next();
        printStudentInfo(students, name);
        //3.计算所有学生的平均年龄，最大年龄，最小年龄
        getValue(students);
        //4.如果存在名字叫张三的将名字改为张兵并输出修改后所有的学生信息
        change(students);
        System.out.println(Arrays.toString(students));
    }

    public static Student[] getData() { //1.将这些Student对象放进数组中

        //--begin---
        String string = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        String[] strings = string.split("\\*");
        Student[] students = new Student[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String[] s = strings[i].split("#");
            students[i] = new Student(s[0], s[1], Integer.parseInt(s[2]));
        }
        return students;
        //---end---
    }

    public static void printStudentInfo(Student[] students, String name) {//2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名），如果没有输出：没有叫田七的同学

        //---begin---
        boolean flag = false;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("没有叫" + name + "的同学");
        }
        //---end---

    }


    public static void getValue(Student[] students) {//3.计算所有学生的平均年龄，最大年龄，最小年龄
        //---begin---
        int sum = 0;
        int max = students[0].getAge();
        int min = students[0].getAge();
        for (Student student : students) {
            sum += student.getAge();
            if (student.getAge() > max) {
                max = student.getAge();
            }
            if (student.getAge() < min) {
                min = student.getAge();
            }
        }
        System.out.println("最大年龄是：" + max);
        System.out.println("最小年龄是：" + min);
        System.out.println("平均年龄是：" + (double) sum / students.length);
        //---end---
    }

    public static void change(Student[] students) {//4.如果存在名字叫张三的将名字改为张兵并输出修改后所有的学生信息，如果没有，输出：没有叫张三的

        //---begin---
        boolean flag = false;
        for (Student student : students) {
            if (student.getName().equals("张三")) {
                student.setName("张兵");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("没有叫张三的同学");
        }
        //---end---

    }

}


