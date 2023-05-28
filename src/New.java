import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class New {
    public static void main(String[] args) {

        System.out.println("����������� ����� ��������� �������� ��������, ���������, ��������� ");
        System.out.println("� ������� � ����� �������: a+b-�, a-b+�, a*b-�, a/b*�.");
        System.out.println("����������� ����� �������� ������ � ������ ������� �� 1 �� 10.");

        Scanner s = new Scanner(System.in);
        System.out.println("������� ���������: ");
        String vvod = s.nextLine();
        System.out.print("��������� ���������: " + vvod);

        String operStr = " ";
        char[] symbol = new char[10];
        char oper = '+';
        for (int i = 1; vvod.length() > i; i++) {
            symbol[i] = vvod.charAt(i);
            if (symbol[i] == '+') {
                oper = '+';
                operStr = "\\+";
            }
            if (symbol[i] == '-') {
                oper = '-';
                operStr = "-";
            }
            if (symbol[i] == '*') {
                oper = '*';
                operStr = "\\*";
            }
            if (symbol[i] == '/') {
                oper = '/';
                operStr = "/";
            }
        }

        int num1;
        int num2;
        int num3;
        int result;
        String[] numbers = vvod.split(operStr);
        if (numbers.length > 3) {
            System.out.println("=? \n���-�� ����� �� ���...\n����������� ������� ������ ��� ����������! ���������� �����.");
            System.exit(0);
        }
        result = 0;
        try {
            num1 = parseInt(numbers[0]);
            num2 = parseInt(numbers[0]);
            num3 = parseInt(numbers[0]);
            if (num1 > 10 | num2 > 10 | num1 < 0 | num2 < 0 | num3 > 10 | num3 < 0) {
                System.out.println("=? \n����������� ����� �������� ������ � ������ ������� �� 1 �� 10 ������������! ���������� �����.");
                System.exit(0);
            }

            result = calculate(num1, num2, num3, oper);
            System.out.println("=" + result);
        } catch (NumberFormatException e) {
            System.out.println("=? \n����������� ����� �������� ������ � ������ ������� �� 1 �� 10 ������������! ���������� �����.");
        }
    }

    public static int calculate(int num1, int num2, int num3, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = (num1 + num2);
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                break;
        }
        return result;
    }
}