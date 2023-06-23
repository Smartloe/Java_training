## 第1关：天气预报
### 编程要求
根据提示，在右侧编辑器补充---begin---end---之间的代码。

接口WeatherState天气状况包含抽象方法showState()显示天气状况。 

多云类CloudyDayState实现天气状况接口WeatherState，重写showState()方法输出"多云"。

少云类CloudyLittleState实现天气状况接口WeatherState,重写showState()方法输出"少云,有时晴"。

大雨类HeavyRainState实现天气状况接口WeatherState，重写showState()方法输出"大雨"。

小雨类LightRainState实现天气状况接口WeatherState，重写showState()方法输出"小雨"。

天气类Weather，成员变量WeatherState state，setState(WeatherState s)方法设置当前天气状况，show()方法调用当前天气状况对应的showState()方法输出天气状况。

### 测试输入：
```shell
无；
```
### 预期输出：
```shell
 今天白天:多云
 今天夜间:小雨转大雨
 明天白天:小雨
 明天夜间:少云,有时晴
```
