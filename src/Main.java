import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите стоимость вашего билета: ");
        int price = in.nextInt();
        int bonusMiles = service.calculate(price);
        System.out.println("За вашу покупку вам начислено " + bonusMiles + " миль.");
    }
}