public class FooCorporation {
    public static void totalPay(double pay, double hour) {
        if (pay < 8 || hour > 60) {
            System.out.println("error");
        }
        else if (hour <= 40)  {
            double money = pay * hour;
            System.out.println(money);
        }
        else {
            double money = pay * 40;
            double extraTime = hour - 40;
            double extraMoney = 1.5 * pay * extraTime;
            money += extraMoney;
            System.out.println(money);
        }
    }
    public static void main(String[] args) {
        totalPay(7.5, 35);
        totalPay(8.2, 47);
        totalPay(10, 73);
    }
}


