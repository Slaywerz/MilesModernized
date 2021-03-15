import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите стоимость вашего билета: ");
        int ticketPrice = in.nextInt();
        int divider = 20;
        int bonusMiles = ticketPrice / divider;
        System.out.println("За вашу покупку вам начислено " + bonusMiles + " миль.");
    }
}