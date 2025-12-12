import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) throws Exception {

        String rez1 = encode("aaaabbbbccccddd".toCharArray());
        System.out.println(rez1);
        String rez2 = encode("wwwwxxxrrrbb".toCharArray());
        System.out.println(rez2);
        String rez3 = encode("33334444555666777".toCharArray());
        System.out.println(rez3);
        encode("".toCharArray());
        encode(" ".toCharArray());
    }

    public static String encode(char[] chars) throws Exception {

        String s=String.valueOf(chars);
        if (s.isBlank()) {
            throw new IllegalArgumentException("The chars must not be blank or null");
        } else {

           Map<Character, Integer> map = new HashMap<>();
           for( char c : chars ) {
               map.put(c,map.getOrDefault(c,0)+1);
           }

           StringBuilder stringBuilder= new StringBuilder();
           for(Map.Entry<Character,Integer> entry:map.entrySet()) {
               stringBuilder.append(entry.getKey()).append(entry.getValue());
           }
            return stringBuilder.toString();
        }

    }
}
