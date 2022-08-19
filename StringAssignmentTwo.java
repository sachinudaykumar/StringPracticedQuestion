import java.util.Arrays;

public class StringAssignmentTwo {

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";

        if (str1.length() == str2.length()){

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);

            if (result) {
                System.out.println("The given string are anagram ");
            } else {
                System.out.println("The given string are not anagram ");;
            }

        } else {
            System.out.println("The give string " + str1 + " and " + str2 + " are not anagram ");
        }

    }
}
