/**
 * Created by jc278710 on 9/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Manual unit test of WordCounter");
        System.out.println("\"simple.txt\" has 5 words");
        String text = TextReader.load("simple.txt");
        int numberOfWords = countWords(text);
        int numberOfLines = countLines(text);
        int numberOfPunctuation = countPunctuation(text);
        System.out.println("Actual number of words: " + numberOfWords);
        System.out.println("Actual number of lines: " + numberOfLines);
        System.out.println("Actual number of punctuation: " + numberOfPunctuation);

        System.out.println("Manual unit test of WordCounter");
        System.out.println("\"multiline.txt\" has 9 words");
        text = TextReader.load("multiline.txt");
        numberOfWords = countWords(text);
        numberOfLines = countLines(text);
        numberOfPunctuation = countPunctuation(text);
        System.out.println("Actual number of words: " + numberOfWords);
        System.out.println("Actual number of lines: " + numberOfLines);
        System.out.println("Actual number of punctuation: " + numberOfPunctuation);

        System.out.println("Manual unit test of WordCounter");
        System.out.println("\"speech.txt\" has 9 words");
        text = TextReader.load("speech.txt");
        numberOfWords = countWords(text);
        numberOfLines = countLines(text);
        numberOfPunctuation = countPunctuation(text);
        System.out.println("Actual number of words: " + numberOfWords);
        System.out.println("Actual number of lines: " + numberOfLines);
        System.out.println("Actual number of punctuation: " + numberOfPunctuation);
    }

    // countWords() method - avoids me having to write the same code main times...
    private static int countWords(String text) {
        int tally = 0;
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n') {
                tally += 1;
            }
        }
        return tally + 1;
    }

    // countLines() method
    private static int countLines(String text) {
        int lines = 0;
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == '\n') {
                lines += 1;
            }
        }
        return lines + 1;
    }

    // countPunctuation() method
    private static int countPunctuation(String text) {
        int punctuation = 0;
        for (int i = 0; i < text.length(); ++ i) {
            if (text.charAt(i) == '.' || text.charAt(i) == ',' || text.charAt(i) == '!' || text.charAt(i) == '?' || text.charAt(i) == '\'' || text.charAt(i) == '\"' || text.charAt(i) == '-' || text.charAt(i) == ':' || text.charAt(i) == ';') {
                punctuation += 1;
            }
        }
        return punctuation;
    }
}
