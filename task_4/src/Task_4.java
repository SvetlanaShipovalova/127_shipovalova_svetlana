//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class Task_4 implements Task_4_base {
    public Task_4() {
    }

    public int[] subtask_1_arrays(int size, int a0, int d) {
        int[] intAr = new int[size];
        intAr[0] = a0;

        for(int i = 1; i < size; ++i) {
            intAr[i] = intAr[i - 1] + d;
        }

        return intAr;
    }

    public int[] subtask_2_arrays(int size) {
        int[] intAr = new int[size];
        intAr[0] = 1;
        if (size > 1) {
            intAr[1] = 1;

            for(int i = 2; i < size; ++i) {
                intAr[i] = Arrays.stream(intAr).sum();
            }
        }

        return intAr;
    }

    public int[] subtask_3_arrays(int size) {
        int[] intAr = new int[size];
        intAr[0] = 0;
        if (size > 1) {
            intAr[1] = 1;

            for(int i = 2; i < size; ++i) {
                intAr[i] = intAr[i - 1] + intAr[i - 2];
            }
        }

        return intAr;
    }
    public int subtask_4_arrays(int[] data) {
        int max = data[0];

        for(int i = 1; i < data.length; ++i) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        return max;
    }

    public int subtask_5_arrays(int[] data, int k) {
        int max = -5;

        for(int i = 1; i < data.length; ++i) {
            if (data[i] > max && data[i] % k == 0) {
                max = data[i];
            }
        }

        return max;
    }

    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        int[] a = new int[arr1.length + arr2.length];
        int k = 0;

        int j;
        for(j = 0; j < arr1.length; ++j) {
            a[j] = arr1[j];
            ++k;
        }

        for(j = 0; j < arr2.length; ++j) {
            a[k] = arr2[j];
            ++k;
        }

        Arrays.sort(a);
        return a;
    }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
