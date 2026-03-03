import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class SameFirstLetter {
    // Lab Exercise #10.2

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     *
     * @param list is a list of strings.
     *             The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String word : list) {
            String key = word.substring(0,1);
            if (!map.containsKey(key)) {
                map.put(key, word);
            } else {
                map.put(key, map.get(key) + "," + word);
            }
        }

        return map;
    }
    public  static void main(String[] args) {

        List<String> list1 = Arrays.asList("alice", "bob", "apple", "banana");
        Map<String, String> map1 = sameFirstLetter(list1);
        for (String key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }

        List<String> list2 = Arrays.asList("after", "all", "this", "time", "always");
        Map<String, String> map2 = sameFirstLetter(list2);
        for (String key : map2.keySet()) {
            System.out.println(key + ": " + map2.get(key));
        }
    }
}
