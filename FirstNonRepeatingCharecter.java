import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharecter {

    public static int firstOccerance(String data) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = data.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstOccerance("codeforcode"));
    }
}
