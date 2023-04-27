## 任务描述
本关任务：超大整数的减法。参考下面的超大整数的加法代码，在右侧--begin--end--之间编写代码实现超大整数的减法。

## 相关知识
为了完成本关任务，你需要掌握：1.如何获取数组的长度，2.如何遍历数组。

## 超大整数的加法示例
```python
public class HandleLargeNumber {
public static void main(String args[]) {
    int a[] = {0,9,9,7,9,4,5,6,7,2,3,4,5,6,4,7,8,9,8,7,6,9};
    int b[] = {0,0,5,9,1,6,4,5,6,2,3,4,5,7,2,1,3,4,0,3,2,9};
    int c[]= new int[a.length];
    int i = 0,result =0,k=0;
    for(i=0;i<a.length;i++) {
        if(a[i]!=0) {
            k=i;
            break;
            }
        }
    for(i=k;i<a.length;i++) {
        System.out.printf("%d",a[i]);
        }
    System.out.printf("\n加上:\n");
    for(i=0;i<b.length;i++) {
        if(b[i]!=0) {
            k=i;
            break;
            }
        }
    for(i=k;i<b.length;i++) {
        System.out.printf("%d",b[i]);
        }
    for(i=a.length-1;i>=0;i--) {
        result = a[i]+b[i];
        if(result>=10) {
            c[i] = result%10;
            a[i-1] = a[i-1]+1;
            }
        else c[i] = result;
        }
    System.out.printf("\n等于:\n");
    for(i=0;i<c.length;i++) {
        if(c[i]!=0) {
            k=i;
            break;
            }
        }
    for(i=k;i<c.length;i++) {
        System.out.printf("%d",c[i]);
        }
    }
}
```
## 编程要求
根据超大整数的加法代码示例，在右侧编辑器补充代码，计算超大整数的减法：

9973345967890899

减去:

59880790808087655448

## 预期输出：
<code>-59870817462119764549</code>