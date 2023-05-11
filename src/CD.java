/**
 * @author Smartloe
 * @create 2023-05-11 10:22
 */
public class CD {
    int size;
    int content[];

    public void setSize(int size) {
        this.size = size;
        content = new int[size];
    }

    public int getSize() {
        return size;
    }

    public int[] getContent() {
        return content;
    }

    public void setContent(int[] b) {
        int min = Math.min(content.length, b.length);
        for (int i = 0; i < min; i++)
            content[i] = b[i];
    }
}


class Computer {
    //---begin---
    //【代码】 声明 int型数组 data[]，CD型对象 includeCD
    int[] data;
    CD includeCD = new CD();

    public void putCD(CD cd) {
        includeCD = cd;
        int size = includeCD.getSize();
        data = new int[size];
    }

    //【代码】copyToComputer()复制数据方法，读取includeCD内容并复制给Computer成员变量数组data
    public void copyToComputer() {
        data = includeCD.getContent();
    }

    public void addData(int m) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + m;
        }
    }

    void copyToCD() {
        includeCD.setContent(data);
    }

    void showData() {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%3d", data[i]);
        }
    }
}


class User {
    public static void main(String args[]) {
        CD dataCD = new CD();
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8};
        dataCD.setSize(b.length);
        dataCD.setContent(b);
        int a[] = dataCD.getContent();
        System.out.println("dataCD 上的内容： ");
        for (int i = 0; i < a.length; i++)
            System.out.printf("%3d", a[i]);
        Computer computerIMB = new Computer();
        //【代码】computerIMB 调用 putCD(CD cd)方法,将 dataCD 的引用传递给 cd
        computerIMB.putCD(dataCD);
        System.out.println("\n 将 dataCD 的数据复制到计算机:computerIMB.");
        //【代码】computerIMB 调用 copyToComputer()方法
        computerIMB.copyToComputer();
        System.out.println("computerIMB 上的内容： ");
        computerIMB.showData();
        int m = 12;
        System.out.println("\ncomputerIMB 将每个数据增加" + m);
        computerIMB.addData(m);
        System.out.println("computerIMB 将增值后的数据复制到 CD:dataCD");
        //【代码】computerIMB 调用 copyToCD()方法
        computerIMB.copyToCD();
        System.out.println("dataCD 上的内容： ");
        a = dataCD.getContent();
        for (int i = 0; i < a.length; i++)
            System.out.printf("%3d", a[i]);
    }
}
//----end----
