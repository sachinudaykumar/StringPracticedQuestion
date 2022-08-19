import java.util.Arrays;

public class StringAssignmentOne {

    public static void main(String[] args) {

        String name = "iNeuron";
        String reversed_string = "";

        System.out.println(name);

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed_string = reversed_string + name.charAt(i);
        }

        System.out.println("Reversed String is - " + reversed_string);
    }
}


