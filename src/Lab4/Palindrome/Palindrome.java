package Lab4.Palindrome;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by uruckcharti on 8/2/2018 AD.
 */
public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("Palindrome-input.txt"));
        PrintWriter pr =  new PrintWriter(new File("Palindrome-output.txt"));
        int cases = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= cases ; i++) {
            String input = sc.nextLine();
            pr.println("Case #"+i+": "+isPalindrome(input));
        }
        pr.close();
    }
    public static boolean isPalindrome(String input){
        input = input.replace(" ","");
        input = input.toLowerCase();
        StringBuilder build = new StringBuilder(input);
        build = build.reverse();
        String output = build.toString();
        return input.equals(output);
    }
}