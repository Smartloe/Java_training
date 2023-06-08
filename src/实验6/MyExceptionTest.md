## 第3关：自定义异常 - 正负数
### 任务描述
本关的任务是通过用户自定义异常的机制，判断一个数是否合法，我们定义为若该数为正数，则合法；反之则不合法。

### 相关知识
自定义异常
在Java中，除了由Java系统监测到的异常(下标越界，被0除等)，用户也可以自定义异常。

用户定义的异常同样要用try{} catch{}捕获，但必须由用户自己抛出 throw new MyException。

异常是一个类,用户定义的异常必须继承自Throwable或Exception类，建议用Exception类。

语法结构如下所示：

class MyException extends Exception {
    …
}
一般的，我们会这么定义一个异常：
```java
class MyException extends Exception {
    public MyException(String m) {
        super(m);
    }
}
```
上述代码中的构造方法MyException(String m)中通过super()调用了父类的构造方法，效果是输出以下结果：

MyException: 字符串m中的内容
在程序中，其抛出异常的语法为：
```java
//""为字符串m中的内容，由用户自定义
throw new MyException("");  
```
### 编程要求
本关的编程要求是补全右侧代码片段中Begin至End中间的代码，具体要求如下：<br />
num变量为命令行输入的int型数据，若num为正数，输出The number you entered is： + num；反之捕获该异常。
### 测试说明
以下是测试样例：
<br />
样例输入：```-60```
<br />
样例输出：```chapter8.step3.MyException: Number cannot be negative!```
<br />
样例输入：```60```
<br />
样例输出：```The number you entered is: 60```