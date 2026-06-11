public class Reverse_words_in_string3 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        
        return result.toString().trim();
    }
}
