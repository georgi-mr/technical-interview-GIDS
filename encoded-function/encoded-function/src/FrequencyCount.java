import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {
        String rez1 = encode("aaaabbbccc".toCharArray());
        System.out.println(rez1);

        String rez2 = encode("abbbcdddd".toCharArray());
        System.out.println(rez2);

        String rezNum = encode("3333344442222".toCharArray());
        System.out.println(rezNum);
    }

    public static String encode(char[] chars) {
        if (chars == null || chars.length == 0) {
            throw new IllegalArgumentException("The char array cannot be null or empty");
        } else {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : chars) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                sb.append(entry.getKey()).append(entry.getValue());
            }

            return sb.toString();
        }
    }
}
