import java.io.*;
import java.util.*;

public class countVowelFile {
    public static int countVowelFile(String fileName) {
        int count = 0;
        HashSet<Character> vowels = new HashSet<>(
                Arrays.asList('a','e','i','o','u')
        );
        File file = new File("TestFile1");
        try{
            Scanner sc = new Scanner(new File(fileName));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (vowels.contains(c)) {
                        count++;
                    }
                }
            }

            sc.close();
        } catch (Exception e) {
        }
        return count;
    }
}
