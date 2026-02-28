package test;

import java.util.Scanner;

public class Im {
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiouy".indexOf(c) != -1;
    }

    public static void main(String[] args) {
    	System.out.println("Enter a word to translate into Oppish: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String result = "";

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            int i = 0;

            while (i < word.length()) {
                if (isVowel(word.charAt(i))) {
                    result += word.charAt(i);
                    i++;
                } else {
                    int start = i;
                    while (i < word.length() && !isVowel(word.charAt(i))) {
                        i++;
                    }
                    result += word.substring(start, i);
                    if (i < word.length()) result += "opp";
                }
            }
            if (w < words.length - 1) result += " ";
        }

        System.out.println(result);
        sc.close();
    }
}
