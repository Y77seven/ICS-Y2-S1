import java.util.List;

public class replaceOddZero {

    public static List<Integer> replaceOddZero(List<Integer> list) {
        replaceOddZeroHelper(list, 0);
        return list;  // ★★ 返回 list ★★
    }

    private static void replaceOddZeroHelper(List<Integer> list, int start) {
        if (start == list.size()) {
            return;
        }

        int current = list.get(start);
        if (current % 2 != 0) {
            list.set(start, 0);
        }

        replaceOddZeroHelper(list, start + 1);
    }

    public static void main(String[] args) {
        List<Integer> list = java.util.Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(replaceOddZero(list));
        // 输出: [0, 2, 0, 4, 0]
    }
}
