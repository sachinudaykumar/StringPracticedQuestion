import java.util.Arrays;

public class StringAssignmentThree {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYS";

        char str1[] = str.toCharArray();

        int [] index = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int size = str1.length;

        if (size == 26){
            for (int i = 0; i<str1.length; i++){
                int a = str1[i] - 65;
                index[a] = 1;
            }

            int i = 0;
            while (i != 26){
                if (index[i] == 1){
                    i++;
                } else {
                    System.out.println("The Given String is not Pangram");
                    System.exit(0);
                }
            }
            System.out.println("The Given String is Pangram");
        } else {
            System.out.println("The Given String is not Pangram");
        }

    }
}
