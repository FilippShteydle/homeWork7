public class Task01 {

/*    Заполнить массив на 15 элементов числами Фибоначчи.
    Вывести на консоль только четные элементы массива.*/

    public static void main(String[] args) {

        int[] arr = new int[15];
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < arr.length; i++) {
            c = a + b;
            a = b;
            b = c;
            arr[i] = c;
        }
        for (int d : arr) {
            if (d % 2 ==0) {
                System.out.print(d + " ");
            }
        }
    }
}
