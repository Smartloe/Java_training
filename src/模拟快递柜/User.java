package 模拟快递柜;

/**
 * @author Smartloe
 * @create 2023-06-08 23:15
 * 用户
 * 取件
 * 输入对应取件码
 * 寄件
 * 输入目的地和重量显示价格
 * 选择到付或寄付
 * 输出快递单号
 */
public class User {
    public void sendPackage(String destination, double weight, boolean isPaidByReceiver) {
        double price = calculatePrice(destination, weight);
        if (isPaidByReceiver) {
            System.out.println("请支付" + price + "元，快递员将在送达时收取");
        } else {
            System.out.println("请支付" + price + "元，快递员将在取件时收取");
        }
        String expressNumber = generateExpressNumber();
        System.out.println("您的快递单号为：" + expressNumber);
    }

    public void receivePackage(String pickUpCode) {
        System.out.println("请出示取件码：" + pickUpCode);
    }

    private double calculatePrice(String destination, double weight) {
        // 根据目的地和重量计算价格
        return 0.0;
    }

    private String generateExpressNumber() {
        // 生成快递单号
        return "123456789";
    }
}


