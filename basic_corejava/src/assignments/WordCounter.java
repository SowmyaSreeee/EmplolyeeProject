package assignments;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        
        System.out.println("Number of words: " + words.length );
    }
}
