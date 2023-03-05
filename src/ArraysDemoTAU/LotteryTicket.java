package ArraysDemoTAU;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 96;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[]generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            /*
            Generate random number then, search to make sure it doesn't already exist in the array. If it does regenerate the number and re-search
             */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while( search(ticket, randomNumber));

            // Here the number is unique and add it to our ticket [] array
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a Sequential Search in an int array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not found
     */
    public static boolean search(int []array, int numberToSearchFor){
//Enhanced Loop: iterates through an array and each time assigns the current element to 'value'
        for (int value : array) {
            if (value == numberToSearchFor){
            return true;
            }
        }
        //here entire array searched and the value was not found
        return false;
    }

    public static boolean binarySearch(int array[], int numberToSearchFor){
        //Array must be sorted
        Arrays.sort(array);

        int index = Arrays.binarySearch(array,numberToSearchFor);
        if (index>=0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("" + ticket[i] + " | ");
        }

    }
}
