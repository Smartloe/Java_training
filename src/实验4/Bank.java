package 实验4;

/**
 * @author Smartloe
 * @create 2023-05-18 10:07
 */
class Bank {
    /*
      Bank类 存款金额savedMoney,存款时间year(年),存款利息interest,存款年利率interestRate
      computerInterest()计算存款利息
      setInterestRate(double rate)设置存款利率
     */
    int savedMoney;
    int year;
    double interest;
    double interestRate = 0.29;

    public double computerInterest() {
        interest = year * interestRate * savedMoney;
        return interest;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }
}

class BankOfDalian extends Bank {
    /*
      Bank类子类BankOfDalian
      存款时间year
      重写computerInterest()计算存款利息，存款年利率按父类Bank计算，不足一年的部分按存款天利率0.012%计算，
      并按如下格式输出对应的存款金额及利息：
      "*元存在大连银行*年零*天的利息:*元"
     */
    double year;


    public double computerInterest() {

//---begin---
        int a = (int) year;
        double b = year - a;
        int days = (int) (b * 365);
        interest = a * interestRate * savedMoney;
        interest += days * 0.00012 * savedMoney;
        System.out.printf("%d 元存在大连银行%d 年零%d 天的利息:%f 元\n", savedMoney, a, days, interest);
        return interest;
//--end---

    }
}

class ConstructionBank extends Bank {
    /*
      Bank类子类ConstructionBank
      存款时间year
      重写computerInterest()计算存款利息，存款年利率按父类Bank计算，不足一年的部分按存款天利率0.01%计算，
      并按如下格式输出对应的存款金额及利息：
      "*元存在建设银行*年零*天的利息:*元"
     */
    double year;

    public double computerInterest() {

//---begin---
        int a = (int) year;
        double b = year - a;
        int days = (int) (b * 365);
        interest = a * interestRate * savedMoney;
        interest += days * 0.0001 * savedMoney;
        System.out.printf("%d 元存在建设银行%d 年零%d 天的利息:%f 元\n", savedMoney, a, days, interest);
        return interest;
//--end---

    }
}

class SaveMoney {
    public static void main(String args[]) {
        int amount = 8000;
        ConstructionBank bank1 = new ConstructionBank();
        bank1.savedMoney = amount;
        bank1.year = 8.236;
        bank1.setInterestRate(0.035);
        double interest1 = bank1.computerInterest();
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savedMoney = amount;
        bank2.year = 8.236;
        bank2.setInterestRate(0.035);
        double interest2 = bank2.computerInterest();
        System.out.printf("两个银行利息相差%f 元\n", interest2 - interest1);
    }
}
