import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task09 {

/*    Заполнить массив размерности n случайными цифрами
    от –2 до n. Если в массиве есть хотя бы одно отрицательное
    значение меньше -1, заменить все отрицательные значение
    в массиве на квадрат (в степени 2) этих значений. Вывести
    исходный и результирующий массив на консоль.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-2, n + 1);
        }

        System.out.println("Первоначальный массив: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < -1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        arr[j] = arr[j] * arr[j];
                    }
                }
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }
}
