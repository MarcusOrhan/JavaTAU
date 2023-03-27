package DataTypes;

import java.util.Scanner;

public class PasswordValidator {
    String userName;
    String oldPassword;

    int eightCharacter = 8;

    public static void main(String[] args) {
        System.out.println("Enter a valid password: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        validatePassword(password);
    }
    public static void validatePassword(String password){

    }
    public static boolean checkLengthOfPassword(String password){
        if (password.length()>=8) {
            return true;
        }return false;
    }
    public static boolean checkUppercase(String password){
if (password.equals(password.toLowerCase())){
    return false;
}return true;
    }
    public static void checkSpecialChar(String password){

    }
    public static boolean checkUsername(String password, String userName){
if (userName.equals(password)){
    return false;

}return true;
    }
    public static void checkOldPassword(String password){

    }
}
