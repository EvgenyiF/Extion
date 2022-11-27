import java.util.ArrayList;
import java.util.Arrays;

public class HomeTaskTwo {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num2 = {1, 1, 2, 2, 5, 3, 2, 1, 3};
        System.out.println("Первый массив " + Arrays.toString(num1));
        System.out.println("Второй массив " + Arrays.toString(num2));
        System.out.println("Частное двух массивов " + divideArray(num1, num2));
    }

    public static ArrayList<Float> divideArray(int[] numbers1, int[] numbers2) {
        ArrayList<Float> res = new ArrayList<>();
        int min = Math.min(numbers1.length, numbers2.length);
        int max = Math.max(numbers1.length, numbers2.length);
        if (min < 1) {
            throw new RuntimeException("один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            if (numbers2[i] != 0) {
                res.add((float) (numbers1[i]/numbers2[i]));
            } else {
                throw new RuntimeException("Деление на ноль");
            }
        }
        return res;
    }

}
