package DataTypes;

public class TextProcessor {
    public static void main(String[] args) {
//        countWords("Su dunyadaki en mutlu kisi mutluluk verendir. ");
//        reverseWords(" Merhaba Sevgiyle acan Cicek.");
        convertCamelCase("Camel case Test senaryosu.");
    }

    /**
     * Splits a String into an array by tokenizing it
     * counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("your text contains %d words: ",numberOfWords );
        System.out.println(message);
        for (int i = 0; i <numberOfWords ; i++) {
            System.out.println( words[i]);
        }
    }

    /**
     * reverses each word of a given string text
     * @param text full String to be reversed
     */
    public static void reverseWords(String text){
        for (int i = text.length()-1; i >=0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void convertCamelCase(String text){

    }

}
