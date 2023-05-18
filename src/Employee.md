## 第3关：员工类与经理类
### 任务描述
本关任务：
仔细阅读右侧编辑区内给出的代码框架及注释，在 Begin-End 中完成抽象类的定义与使用，具体要求如下： 

定义员工抽象类 Employee，其中包含 2 个受保护的变量和两个抽象方法；  

两个变量：
姓名 name（String），和工资 salary（double）；

抽象方法 work()，无返回值，表示工作内容；

抽象方法 info()，无返回值，表示员工信息。

定义一个经理类 Manager，该类继承员工类，除了有员工类的基本属性外，还有岗位级别 gender（String）私有属性。  

一个有参构造方法；

重写 work() 方法，输出：“我负责对施工项目实施全过程、全面管理。”；

重写 info() 方法，输出：“姓名：xx，工资：xx，岗位级别：xx”。

### 测试说明
平台会对你编写的代码进行测试：

### 测试输入：
```shell
张三
80000
项目经理
```

### 预期输出：
```shell
姓名：张三，工资：80000.0，岗位级别：项目经理
我负责对施工项目实施全过程、全面管理。
```