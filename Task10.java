import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

/*    Заполнить массив размерности n случайными циф-
    рами от 0 до 33. Найти элемент массива, который делится
    без остатка на значение элемента слева и значение элемен-
    та справа. Вывести на консоль значения исходного массива.
    Вывести индекс найденного элемента, если такой не найден,
    вывести -1. n – задается с клавиатуры.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        int elem = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 33);
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] % arr[i - 1] == 0 && arr[i] % arr[i + 1] == 0) {
                flag = true;
                elem++;
            }
            if (flag) System.out.println("индекс элемента " + i);
            flag = false;
        }
        if (elem == 0) System.out.println("-1");
    }
}
