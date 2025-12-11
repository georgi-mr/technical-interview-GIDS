public class RunLengthEncoded {

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

                throw new Exception(" =( --> The string cannot be null or empty");

            } else{

                if(str.chars().allMatch(Character::isDigit)){

                    System.out.println("We have numbers in our string! You should pay more attention =] -->");

                } else{

                    System.out.println("Congratulations! We have a clear string <3 <3 -->");
                }


            // Logic->process string
               StringBuilder builder=new StringBuilder();
                int count=1;
                for(int i=0;i<str.length()-1;i++){
                    if(str.charAt(i)==str.charAt(i+1)){
                       count++;
                    } else{
                        builder.append(str.charAt(i)).append(count);
                        count=1;
                    }

                }
                builder.append(str.charAt(str.length()-1)).append(count);
                return builder.toString();
            }
        }
}
