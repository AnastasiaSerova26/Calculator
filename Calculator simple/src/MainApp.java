import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите операцию (+, -, *, /)");
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            int result = a + b;
            System.out.println("Сумма чисел равна " + result);
        }
        if (operation == '-') {
            int result = a - b;
            System.out.println("Разность чисел равна " + result);
        }
        if (operation == '*') {
            int result = a * b;
            System.out.println("Умножение чисел равно " + result);
        }
        if (operation == '/') {
            int result = a / b;
            System.out.println("Деление чисел равно " + result);
        }

    }
}
