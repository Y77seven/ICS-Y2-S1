public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println(revNum("x123_#_4567 yz"));
    }
    public static String revNum(String input) {
        if (input == null || input.length() == 0) return input;

        // 1) 收集所有数字
        String digits = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                digits += c;
            }
        }

        // 2) 再构造结果：遇到数字就从 digits 末尾取
        String result = "";
        int k = digits.length() - 1;   // 指向最后一个数字
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                result += digits.charAt(k);
                k--;
            } else {
                result += c;
            }
        }
        return result;
    }
}
