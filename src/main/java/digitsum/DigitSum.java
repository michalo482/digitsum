package digitsum;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Podaj liczę całkowitą, której sumę cyfr chcesz obliczyc: ");
        int number = readValue();

        int number2;
        if (number > 0) {
            number2 = number;
        } else {
            number2 = -number;
        }

        System.out.println("Suma cyfr liczby " + number + " do wartości jednocyfrowej to " + digSum(number2));

    }

    static int digSum(int number2) {
        int sum = 0;
        while (number2 > 0 || sum > 9) {
            if (number2 == 0) {
                number2 = sum;
                sum = 0;
            }
            sum += number2 % 10;
            number2 /= 10;
        }
        return sum;
    }

    public static int readValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

