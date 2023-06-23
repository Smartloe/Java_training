## 第4关：动物声音模拟器
### 任务描述
本关任务设计一个动物声音“模拟器”，希望模拟器可以模拟许多动物的叫声，要求如下。

- 编写抽象类Animal

Animal抽象类有两个抽象方法cry()和getAnimalName()，即要求各种具体的动物给出自己的叫声和种类名称。

- 编写模拟器类Simulator

该类有一个playSound(Animal animal)方法，该方法的参数是Animal类型。即参数animal可以调用Animal的子类重写的cry()方法播放具体动物的声音，调用子类重写的getAnimalName()方法显示动物种类的名称。

- 编写Animal类的子类：Dog和Cat类

- 编写主类Main（用户程序）

在主类Main的main方法中至少包含如下代码：
```
Simulator simulator = new Simulator();

simulator.playSound(new Dog());

simulator.playSound(new Cat());
```

### 测试输入:```无```

### 输出：
```
现在播放狗类的声音:汪汪...汪汪
现在播放猫类的声音:喵喵...喵喵
```