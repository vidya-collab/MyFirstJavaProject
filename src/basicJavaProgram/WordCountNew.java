package basicJavaProgram;



public class WordCountNew {

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String sentence = "Hello world this is a test";
        System.out.println("Word count: " + countWords(sentence));
    }
}
