/**
 * Created by jc278710 on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        String text = TextReader.load("simple.txt");
        System.out.println(text);

        System.out.println("Manual unit test of WordCounter");
        System.out.println("\"multiline.txt\" has 9 words");
        text = TextReader.load("multiline.txt");
        int tally = 0;
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n') {
                tally += 1;
            }
        }
        int numberOfWords = tally + 1;
        System.out.println("Actual number of words: " + numberOfWords);
    }
}
