//Произведите ввод данных с клавиатуры в массив,
// а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.

import java.util.Arrays;
import java.util.Scanner;

public class Task_eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " элемент массива ");
            array[i] = scanner.nextInt();
            array[i]*= 2;
        }
        System.out.println(Arrays.toString(array));
    }
}
