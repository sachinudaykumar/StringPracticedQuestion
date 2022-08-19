import java.util.Arrays;

public class StringAssignmentSeven {

    public static void main(String[] args) {

        String str = "#*schin*islearning!java,@ineuron!!@";

        int count_spcl_character = 0;

        char ch[] = str.toCharArray();

        for (int i = 0; i<ch.length; i++){

            if (ch[i] == '#' || ch[i] == '*' || ch[i] == '!' || ch[i] == ',' || ch[i] == '@'){
                count_spcl_character++;
            }
        }
        System.out.println("Number of Special Character found is - " + count_spcl_character);

    }
}
