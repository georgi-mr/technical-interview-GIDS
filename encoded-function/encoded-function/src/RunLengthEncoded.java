public class RunLengthEncoded {
    public static void main(String[] args) throws Exception {

        String rez1 = encode("aaaabbbccc".toCharArray());
        System.out.println(rez1);
        String rez2 = encode("abbbcdddd".toCharArray());
        System.out.println(rez2);
        String rez3 = encode("wwwwaaadexxxxxx".toCharArray());
        System.out.println(rez3);
        String rez4 = encode("33334444555666777".toCharArray());
        System.out.println(rez4);
        //encode("".toCharArray());
        //encode(" ".toCharArray());
    }

    public static String encode(char[] chars) throws Exception {

        String s=String.valueOf(chars);
        if (s.isBlank()) {
            throw new IllegalArgumentException("The chars must not be blank or null");
        } else {

            int count = 1;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == chars[i + 1]) {
                    count++;
                } else {
                    stringBuilder.append(chars[i]).append(count);
                    count = 1;
                }
            }
            stringBuilder.append(chars[chars.length - 1]).append(count);
            return stringBuilder.toString();

        }

    }

}
