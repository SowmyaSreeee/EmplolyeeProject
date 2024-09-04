package assignments;

import java.util.Scanner;

public class StringPermutations {
	static int counter = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to find its permutations:");
        String input = scanner.nextLine();

        System.out.println("Permutations of the string are:");
        generatePermutations(input, "");
        System.out.println(counter);
    }

    public static void generatePermutations(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            counter++;
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i));
            }
        }
    }
}
