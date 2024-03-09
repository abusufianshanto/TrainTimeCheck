import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is "+localDate);
        System.out.println("From: ");
        Scanner input = new Scanner(System.in);
        String from = input.nextLine();
            if(fromCheck(from)==true) {
                System.out.println("From: "+from);
            } else {
                throw new IllegalArgumentException("Input must contain only characters");
            }
       String to = input.nextLine();
            if(toCheck(to)==true) {
                System.out.println("To: "+to);
            } else {
                throw new IllegalArgumentException("Input must contain only characters");
            }


    }
    public static boolean fromCheck(String from) {
        for (int i = 0; i < from.length(); i++) {
            char ch = from.charAt(i);
            if (!Character.isLetter(ch)) { // Check if the character is a letter
                return false;
            }
        }
        return true;
    }

    public static boolean toCheck(String to) {
        for (int i = 0; i < to.length(); i++) {
            char ch = to.charAt(i);
            if (!Character.isLetter(ch)) { // Check if the character is a letter
                return false;
            }
        }
        return true;
    }
}

