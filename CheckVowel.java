public class CheckVowel {

    public static boolean allVowels(String input) {
        // Convert the input string to lowercase to handle both upper and lowercase characters
        input = input.toLowerCase();
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check if the current character is not a vowel
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                return false;  // If a non-vowel is found, return false
            }
        }
        // If no non-vowel characters were found, return true
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(allVowels("aeiou"));  // true
        System.out.println(allVowels("AeioU"));  // true
        System.out.println(allVowels("hello"));  // false
        System.out.println(allVowels("aaaeeeii"));  // true
        System.out.println(allVowels("xyz"));  // false
    }
}
