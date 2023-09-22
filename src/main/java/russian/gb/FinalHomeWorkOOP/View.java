package russian.gb.FinalHomeWorkOOP;

import java.util.Scanner;

// Класс для взаимодействия с пользователем
public class View {
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Калькулятор комплексных чисел");
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        System.out.println("0. Выход");
    }

    public void run() {
        Calculator calculator = ComplexCalculatorFactory.createCalculator();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем перевод строки

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            ComplexNumber a, b;

            System.out.print("Введите действительную часть первого числа: ");
            double realA = scanner.nextDouble();
            a = new ComplexNumber(realA);

            System.out.print("Введите действительную часть второго числа: ");
            double realB = scanner.nextDouble();
            b = new ComplexNumber(realB);

            ComplexNumber result;

            switch (choice) {
                case 1:
                    result = calculator.add(a, b);
                    System.out.println("Результат сложения: " + result);
                    break;
                case 2:
                    result = calculator.multiply(a, b);
                    System.out.println("Результат умножения: " + result);
                    break;
                case 3:
                    result = calculator.divide(a, b);
                    System.out.println("Результат деления: " + result);
                    break;
                default:
                    System.out.println("Неверный выбор операции. Попробуйте еще раз.");
            }
        }
    }
}

