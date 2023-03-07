package DataTypes;

public class TextProcessor {
    public static void main(String[] args) {
//        countWords("Su dunyadaki en mutlu kisi mutluluk verendir. ");
//        reverseWords(" Merhaba Sevgiyle acan Cicek.");
        convertCamelCase("Camel case Test senaryosu.");
        addSpaces("HeyLittleTester?HowIsEverythingGoingToday?");
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

    /**
     * adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if( i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;//adding index of space just added to insertion place
            }
        }
        System.out.println("modifiedText = " + modifiedText);
    }

    /**
     * converts a string Sentence to camelCase
     * removes spaces and capitalize each word except first letter
     * @param text Setence or pharease to be converted camelCase
     */
    public static void convertCamelCase(String text){
var modifiedText = new StringBuilder(text);
        for (int i = 0; i <modifiedText.length() ; i++) {

        }
    }

}
