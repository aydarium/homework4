package ru.aydar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Минимальное значение типа данных byte = " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение типа данных byte = " + Byte.MAX_VALUE);
        System.out.println("Минимальное значение типа данных short = " + Short.MIN_VALUE);
        System.out.println("Максимальное значение типа данных short = " + Short.MAX_VALUE);
        System.out.println("Минимальное значение типа данных integer = " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение типа данных integer = " + Integer.MAX_VALUE);
        System.out.println("Минимальное значение типа данных long = " + Long.MIN_VALUE);
        System.out.println("Максимальное значение типа данных long = " + Long.MAX_VALUE);
        System.out.println("Минимальное значение типа данных double = " + Double.MIN_VALUE);
        System.out.println("Максимальное значение типа данных double = " + Double.MAX_VALUE);
        System.out.println("Минимальное значение типа данных float = " + Float.MIN_VALUE);
        System.out.println("Максимальное значение типа данных float = " + Float.MAX_VALUE);
        int intNum = 9056;
        double doubleNum = 5258.9234;
        float floatNum = 2321.232312f;
        double doubleResult = intNum + doubleNum + floatNum; //при сложении всех трёх чисел получается сумма в double, другой тип у doubleResult не указать
        float floatResult = intNum + floatNum; //тут сумма получается во float
        System.out.println(intNum + " + " + doubleNum + " + " + floatNum + " = " + doubleResult);
        System.out.println(intNum + " + " + floatNum + " = " + floatResult);
        int intUnderflow = Integer.MIN_VALUE - 1;
        int intOverflow = Integer.MAX_VALUE + 1;
        System.out.println(Integer.MIN_VALUE + " - 1 =  " + intUnderflow + " (при попытке выйти за пределы минимального значения int с помощью вычитания случается wraparound и мы получаем максимальное значение int)");
        System.out.println(Integer.MAX_VALUE + " + 1 =  " + intOverflow + " (при попытке выйти за пределы максимального значения int с помощью сложения случается wraparound и мы получаем минимальное значение int)");
        System.out.println("А теперь выйдем за пределы максимального значения с помощью Math.addExact, в итоге вызвав exception:");
        int intOverflowException = Integer.MAX_VALUE - 3;
        for (int i = 0; i < 4; i++) {
            try {
                intOverflowException = Math.addExact(intOverflowException, 1);
                System.out.println(intOverflowException);
            } catch (Exception e) {
                System.out.println("Поймали integer overflow!");
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5:");
        String input = scanner.next();
        switch (input){
            case "1":
                System.out.println("Это один");
                break;
            case "2":
                System.out.println("Это два");
                break;
            case "3":
                System.out.println("Это три");
                break;
            case "4":
                System.out.println("Это четыре");
                break;
            case "5":
                System.out.println("Это пять");
                break;
            default:
                System.out.println("Вы ввели что-то другое");
        }
        if (input.matches("1|2|3|4|5"))
        {
            int inputInt = Integer.parseInt(input);
            if (5555 % inputInt == 0) System.out.println("При делении числа 5555 на " + inputInt + " остатка нет.");
                else System.out.println("При делении числа 5555 на " + inputInt + " остаток равен " + 5555 % inputInt);
        }
    }
}
