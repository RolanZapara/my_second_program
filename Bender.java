import java.util.Scanner;

public class Bender {
    public static void main(String[] args) {
        Scanner Bender  = new Scanner(System.in);

        double fn;
        double sn;
        double result;

        System.out.println("Введите первое число: ");
        fn = Bender.nextDouble();

        System.out.println("Введите второе число: ");
        sn = Bender.nextDouble();

        result = fn + sn;

        System.out.println("Сумма равна: " + result);
    }
}

