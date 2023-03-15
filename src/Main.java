/*
Вычислить факториал целых чисел от 1 до 10 с помощью цикла while.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Вычисление факториала");
        final int FACTOR = 10;
        int i = 1;
        int result = 1;
        while (i <= FACTOR) {
            result *= i;
            System.out.printf("Факториал числа %d равен %d\n", i, result);
            i++;
        }
    }
}