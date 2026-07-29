import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> freq = new HashMap<>();

        for(String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for(String key : freq.keySet()) {
            System.out.println(key + " : " + freq.get(key));
        }
    }
}
