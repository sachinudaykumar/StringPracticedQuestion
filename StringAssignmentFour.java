import java.util.Arrays;

public class StringAssignmentFour {

    public static void main(String[] args) {

        String name = "abcccdef";
        char name1[] = name.toCharArray();
        System.out.println(name);
        String repeated_char = "";

        for (int i = 0; i < name.length(); i++){
            for (int j = i + 1; j < name.length(); j++){
                if (name1[i] == name1[j]){
                    repeated_char = repeated_char + name1[j];
                }
            }
        }
        System.out.println("Repeated Characters are -- " + repeated_char);

    }
}
