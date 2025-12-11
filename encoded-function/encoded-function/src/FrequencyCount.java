import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) throws Exception {

        String rez1 =encode("aaaabbbccc");
        System.out.println(rez1);
        String rez2 =encode("abbbcdddd");
        System.out.println(rez2);
        //Testing null or empty string
        //encode("");
        //encode(" ");
        String rezNum=encode("3333344442222");
        System.out.println(rezNum);
    }

    public static String encode(String str) throws Exception {

        //Validate string
        if(str.isBlank()){

            throw new Exception(" =( -> The string cannot be null or empty");

        } else{

            if(str.chars().allMatch(Character::isDigit)){

                System.out.println("We have numbers in our string! You should pay more attention =] -->");

            } else{

                System.out.println("Congratulations! We have a clear string <3 <3 -->");
            }

            // Logic->process string
            Map<Character,Integer>map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                Character c=str.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }
            StringBuilder stringBuilder=new StringBuilder();

            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                stringBuilder.append(entry.getKey()).append(entry.getValue());
            }

            return stringBuilder.toString();
        }
    }

}
