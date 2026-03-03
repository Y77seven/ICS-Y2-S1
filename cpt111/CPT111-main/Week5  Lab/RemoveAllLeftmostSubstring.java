public class RemoveAllLeftmostSubstring {
    public static void main(String[] args) {
        System.out.println(removeLeftmostSubstring("abcd", "abc"));
        System.out.println(removeLeftmostSubstring("ababccd", "abc"));
    }
    public static String removeLeftmostSubstring(String input, String target) {
        int index = input.indexOf(target);
        if (target.length() == 0) return input;
        while (index != -1) {
            input = input.substring(0, index) + input.substring(index + target.length());
            index = input.indexOf(target);
        }
        return input;
    }
}
