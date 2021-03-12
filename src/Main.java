import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите стоимость вашего билета: ");
        int ticket_price = in.nextInt();
        int divider = 20;
        int bonus_miles = ticket_price / divider;
        System.out.println(bonus_miles);
    }
}