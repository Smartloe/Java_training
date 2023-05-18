/**
 * @author Smartloe
 * @create 2023-05-18 11:17
 */
//----begin-----
//编写抽象类Animal
//Animal抽象类有两个抽象方法cry()和getAnimalName()，即要求各种具体的动物给出自己的叫声和种类名称。
abstract class Animal {
    public abstract String cry();

    public abstract String getAnimalName();

}

//编写模拟器类Simulator
//该类有一个playSound(Animal animal)方法，该方法的参数是Animal类型。即参数animal可以调用Animal的子类重写的cry()方法播放具体动物的声音，调用子类重写的getAnimalName()方法显示动物种类的名称。
class Simulator {
    // 播放指定动物的声音
    public void playSound(Animal animal) {
        System.out.println("现在播放" + animal.getAnimalName() + "的声音:" + animal.cry());
    }
}

//编写Animal类的子类：Dog和Cat类
class Cat extends Animal {
    @Override
    public String cry() {
        return "喵喵...喵喵";

    }

    @Override
    public String getAnimalName() {
        return "猫类";
    }
}

class Dog extends Animal {
    @Override
    public String cry() {
        return "汪汪...汪汪";
    }

    @Override
    public String getAnimalName() {
        return "狗类";
    }
}

//----end----

class Main123 {
    public static void main(String args[]) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}