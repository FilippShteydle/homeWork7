import java.util.Random;
import java.util.stream.IntStream;

public class Task02 {

/*    Заполнить массив на 30 элементов случайными числами
    от -70 до +50. Найти минимальный элемент и вывести его
    на консоль. Найти максимальный элемент и вывести его на
    консоль.*/

    public static void main(String[] args) {

        int[] arr = new int[30];
        int min = 0;
        int max = 0;

        Random random = new Random();

        for (int i = 0; i < arr.length; i ++) {
            arr[i] = random.nextInt(-70, 50);
        }
        for (int a : arr) {
            if (a < min) {
                min = a;
            } else if (a > max) {
                max = a;
            }
        }
        System.out.println("Минимальный элемент массива равен " + min);
        System.out.println("Максимальный элемент массива равен " + max);
    }
}
