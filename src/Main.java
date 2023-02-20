import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int C;
        int H;
        int O;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите количество атомов углерода: ");
        C = scanner.nextInt();

        System.out.println("Введите количество атомов водорода: ");
        H = scanner.nextInt();

        System.out.println("Введите количество атомов кислорода: ");
        O = scanner.nextInt();

        int C1 = C/2;
        int H1 = H/6;
        int O1 = O;

        int change = Math.min(C1, H1);
        int result = Math.min(change, O1);

        System.out.print("Максимальное количество молекул: " + result);

    }
}