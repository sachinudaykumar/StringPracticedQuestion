import java.util.Arrays;

public class StringAssignmentSix {

    public static void main(String[] args) {

        String str = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        int count_vowels = 0;
        int count_consonants = 0;

        char ch[] = str.toCharArray();

        for (int i = 0; i<ch.length; i++){

            if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'){
                count_vowels++;
            } else {
                count_consonants++;
            }
        }
        System.out.println("Number of Vowels present in given string is - " + count_vowels);
        System.out.println("Number of Consonants present in given string is - " + count_consonants);

    }
}
