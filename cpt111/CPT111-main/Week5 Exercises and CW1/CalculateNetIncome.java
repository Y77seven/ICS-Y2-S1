public class CalculateNetIncome {
    public static void main(String[] args) {
        int netIncome = calcNetIncome("salary 15000yuan bonus2000 rent -1000Y");
        System.out.println("Net Income = " + netIncome);
        int netIncome2 = calcNetIncome("25000 gross income, -200 water, electricity:-300");
        System.out.println("Net Income = " + netIncome2);
    }
    public static int calcNetIncome(String input) {
        int sum = 0;
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                temp += c;
            }
            else if (c == '-'){
                if (!temp.isEmpty() && !temp.equals("-")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
                if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                    temp = "-";
                } else {
                    temp = "";
                }
            }
            else{
                if (!temp.equals("") && !temp.equals("-")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                } else if (temp.equals("-")) {
                    temp = "";
                }
            }
        }
        if (!temp.equals("") && !temp.equals("-")) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
}
