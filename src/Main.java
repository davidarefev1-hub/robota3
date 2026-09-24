import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        System.out.print("Введіть число з плаваючою крапкою: ");
        double decimal = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        String text = scanner.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean logic = scanner.nextBoolean();

        System.out.println();

        System.out.println("1. " + number);

        System.out.print("2. " + decimal);
        System.out.println();

        System.out.printf("3. %d%n", number);

        System.out.printf("4. %.2f%n", decimal);

        System.out.printf("5. %.3f%n", decimal);

        System.out.printf("6. %s%n", text);

        System.out.printf("7. %b%n", logic);

        System.out.printf("8. %10d%n", number);

        System.out.printf("9. %10.2f%n", decimal);

        System.out.printf("10. %-10s%n", text);

        scanner.close();
    }
}
