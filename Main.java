import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLo World!");

        Scanner sc = new Scanner(System.in);

        // Ім’я користувача
        System.out.print("Please, enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // Факторіал довжини імені
        int length = name.length();
        System.out.println("Your name has " + length + " letters. " + length + "! = " + factorial(length));

        // Дата народження
        System.out.print("Please, enter your birth date in format (DD.MM.YYYY): ");
        String birthDateStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);
        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(birthDate, today);
        long days = ChronoUnit.DAYS.between(birthDate, today);

        System.out.println("Today is " + today.format(formatter) + ", you are " + years + " years (" + days + " days) old.");
    }

    // Метод для факторіалу
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
