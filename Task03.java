public class Task03 {

   /* Написать программу, которая проверяет, все ли значения
    элементов массива одинаковые. Вывести: Yes – если все оди-
    наковы и No – если имеется хоть одно различие. Массив за-
    дается и инициализируется в начале программы.*/

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 2, 1, 1, 1};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[i]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
