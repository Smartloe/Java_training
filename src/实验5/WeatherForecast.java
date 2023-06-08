package 实验5;

/**
 * @author Smartloe
 * @create 2023-05-25 10:15
 */
/*
 * 接口WeatherState天气状况
 * 抽象方法showState()显示天气状况
 */
interface WeatherState {
    public void showState();
}

/*
 * 多云类CloudyDayState实现天气状况接口WeatherState
 * 重写showState()方法输出"多云"
 */
class CloudyDayState implements WeatherState {
    @Override
    public void showState() {
        System.out.print("多云");
    }
}

//----begin----

/*
 * 少云类CloudyLittleState实现天气状况接口WeatherState
 * 重写showState()方法输出"少云,有时晴"
 */
class CloudyLittleState implements WeatherState {
    @Override
    public void showState() {
        System.out.print("少云,有时晴");
    }
}

/*
 * 大雨类HeavyRainState实现天气状况接口WeatherState
 * 重写showState()方法输出"大雨"
 */
class HeavyRainState implements WeatherState {
    @Override
    public void showState() {
        System.out.print("大雨");
    }
}

/*
 * 小雨类LightRainState实现天气状况接口WeatherState
 * 重写showState()方法输出"小雨"
 */
class LightRainState implements WeatherState {
    @Override
    public void showState() {
        System.out.print("小雨");
    }
}

/*
 * 天气类Weather
 * 成员变量WeatherState对象state
 * setState(WeatherState s)方法设置当前天气状况
 * show()方法调用当前天气状况对应的showState()方法输出天气状况
 */
class Weather {
    WeatherState state;

    public void setState(WeatherState state) {
        this.state = state;
    }
    public void show() { // 输出当前天气状况
        state.showState();
    }
}
//----end----

public class WeatherForecast { // 主类
    public static void main(String args[]) {
        Weather weatherBeijing = new Weather();
        System.out.print("\n 今天白天:");
        weatherBeijing.setState(new CloudyDayState());
        weatherBeijing.show();
        System.out.print("\n 今天夜间:");
        weatherBeijing.setState(new LightRainState());
        weatherBeijing.show();
        System.out.print("转");
        weatherBeijing.setState(new HeavyRainState());
        weatherBeijing.show();
        System.out.print("\n 明天白天:");
        weatherBeijing.setState(new LightRainState());
        weatherBeijing.show();
        System.out.print("\n 明天夜间:");
        weatherBeijing.setState(new CloudyLittleState());
        weatherBeijing.show();
    }
}

