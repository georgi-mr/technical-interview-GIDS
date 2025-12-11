
    public class RunLengthEncoded {

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
            }

            StringBuilder builder = new StringBuilder();
            int count = 1;


            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == chars[i - 1]) {
                    count++;
                } else {
                    builder.append(chars[i - 1]).append(count);
                    count = 1;
                }
            }

            builder.append(chars[chars.length - 1]).append(count);

            return builder.toString();
        }
    }
