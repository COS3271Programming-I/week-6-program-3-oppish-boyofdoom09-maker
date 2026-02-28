package test;

public class Im {

    public static void main(String[] args) {

        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder word = new StringBuilder();

      
        for (int i = 0; i < 10; i++) {
            int randomIndex = (int)(Math.random() * letters.length());
            word.append(letters.charAt(randomIndex));
        }

        System.out.println("Original word: " + word);

        for (int i = 0; i < 19; i++) {

            int position = (int)(Math.random() * 10);

            int newLetterIndex = (int)(Math.random() * letters.length());
            char newLetter = letters.charAt(newLetterIndex);

            word.setCharAt(position, newLetter);

            System.out.println("Change " + (i + 1) + ": " + word);
        }
    }
}
