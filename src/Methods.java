import java.util.Arrays;
import java.util.Random;

public class Methods {


    public void Array() {
        int[] array = new int[10];
        Random numbers = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = numbers.nextInt(10);
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    getMinValue(array[j]);
                }
            }
        }
        String tablicaC = Arrays.toString(array).replace("[", "").replace("]", "");
        System.out.println(tablicaC);
    }

    public void getMinValue(int numbers) {
        int small;

        for (small = 0; small < numbers; small++) {

        }
        System.out.println("Najmniejsza liczba z liczb powtarzających sie w ponizszej tabeli to: " + small);
    }
}











