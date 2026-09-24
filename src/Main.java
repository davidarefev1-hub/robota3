import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите int, double, String, boolean через пробел: ");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.next();
        boolean b = sc.nextBoolean();

        System.out.printf("1: %d | %.2f | %s | %b%n", i, d, s, b);
        System.out.printf("2: Dec=%d | Hex=0x%X | Oct=0%o%n", i, i, i);
        System.out.printf("3: [%10.4f]%n", d);
        System.out.printf("4: [%-15.5s]%n", s);

        System.out.println(MessageFormat.format("5: String=\"{0}\", Bool={1}, Int={2}", s, b, i));
        System.out.println(MessageFormat.format("6: Int={0,number,integer}, Dbl={1,number,#,##0.000}", i, d));
        System.out.println(MessageFormat.format("7: Percent={0,number,percent}", d));

        System.out.println("8: %08d | %.1f".formatted(i, d));
        System.out.println("9: [%20S]".formatted(s));
        System.out.println("10: %+d | %B".formatted(i, b));
    }
}
