import java.util.Random;

public class Task05 {

/*    Заполнить массив на 10 элементов случайными числами
    от -10 до +10. Посчитать количество повторяющихся значений.
    Вывести на консоль только повторяющиеся элементы
    и количество повторений.*/

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 11);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length && j != i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    flag = true;
                }
            }
            if (flag) System.out.println(arr[i] + "-" + count + (count == 1 ? " раз" : " раза"));
            count = 0;
            flag = false;
        }
    }
}
