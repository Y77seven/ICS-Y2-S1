import java.util.Arrays;

public class TwoSwappable {
    public static void main(String[] args) {
        System.out.println(twoSwappable("abcde", "cdabe"));
        System.out.println(twoSwappable("abcde", "edcba"));
        System.out.println(twoSwappable("abcde", "daceb"));
    }
    public static boolean twoSwappable(String s1, String s2) {
        int evenLen1 = (s1.length() + 1) / 2;
        int oddLen1 = s1.length() / 2;
        char[] even1 = new char[evenLen1];
        char[] odd1 = new char[oddLen1];
        int e1 = 0;
        for (int i = 0; i<s1.length(); i = i + 2) {
            even1[e1++] = s1.charAt(i);
        }
        int o1 = 0;
        for (int i = 1; i<s1.length(); i = i + 2) {
            odd1[o1++] = s1.charAt(i);
        }

        int evenLen2 = (s2.length() + 1) / 2;
        int oddLen2 = s2.length() / 2;
        char[] even2 = new char[evenLen2];
        char[] odd2 = new char[oddLen2];
        int e2 = 0;
        for (int i = 0; i<s2.length(); i = i + 2) {
            even2[e2++] = s2.charAt(i);
        }
        int o2 = 0;
        for (int i = 1; i<s2.length(); i = i + 2) {
            odd2[o2++] = s2.charAt(i);
        }
//        Arrays.sort(even1);
//        Arrays.sort(odd1);
//        Arrays.sort(even2);
//        Arrays.sort(odd2);
//        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
        for (int i = 0; i < even1.length - 1; i++) {
            for (int j = i + 1; j < even1.length; j++) {
                if (even1[i] > even1[j]) { char t = even1[i]; even1[i] = even1[j]; even1[j] = t; }
            }
        }
        for (int i = 0; i < odd1.length - 1; i++) {
            for (int j = i + 1; j < odd1.length; j++) {
                if (odd1[i] > odd1[j]) { char t = odd1[i]; odd1[i] = odd1[j]; odd1[j] = t; }
            }
        }
        for (int i = 0; i < even2.length - 1; i++) {
            for (int j = i + 1; j < even2.length; j++) {
                if (even2[i] > even2[j]) { char t = even2[i]; even2[i] = even2[j]; even2[j] = t; }
            }
        }
        for (int i = 0; i < odd2.length - 1; i++) {
            for (int j = i + 1; j < odd2.length; j++) {
                if (odd2[i] > odd2[j]) { char t = odd2[i]; odd2[i] = odd2[j]; odd2[j] = t; }
            }
        }

// ---- 比较（逐位比较，不能用 Arrays.equals）----
        if (even1.length != even2.length || odd1.length != odd2.length) return false;

        for (int i = 0; i < even1.length; i++) {
            if (even1[i] != even2[i]) return false;
        }
        for (int i = 0; i < odd1.length; i++) {
            if (odd1[i] != odd2[i]) return false;
        }

        return true;
    }
}
