import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Массивы урок 1");

        System.out.println("Задание 1");

        int[] array = new int[]{1, 2, 3};
        double[] newArray = {1.57, 7.654, 9.986};
        int[] finalArray = new int[3];
        finalArray[0] = 7;
        finalArray[1] = 9;
        finalArray[2] = 23;

        System.out.println("Задание 2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? System.lineSeparator() : ", "));
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + (i == newArray.length - 1 ? System.lineSeparator() : ", "));

        }
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + (i == finalArray.length - 1 ? System.lineSeparator() : ", "));

        }
        System.out.println("Задание 3");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i ==0  ? System.lineSeparator() : ", "));

        }
        for (int i = newArray.length - 1; i >= 0; i--) {
            System.out.print(newArray[i] + (i ==0  ? System.lineSeparator() : ", "));

        }
        for (int i = finalArray.length - 1; i >= 0; i--) {
            System.out.print(finalArray[i] + (i ==0  ? System.lineSeparator() : ", "));
        }

        System.out.println("Задание 4");


        for (int i =0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }

        }
        System.out.println(Arrays.toString(array));

    }

}