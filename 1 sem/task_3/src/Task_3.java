//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Task_3 implements Task_3_base {
    public Task_3() {
    }

    public int subtask_1_for(int n1, int n2, int a, int b) {
        int c = 0;
        int i;
        if (n1 > n2) {
            for(i = n2; i <= n1; ++i) {
                if (i % a == 0 && i % b != 0) {
                    ++c;
                }
            }
        } else {
            for(i = n1; i <= n2; ++i) {
                if (i % a == 0 && i % b != 0) {
                    ++c;
                }
            }
        }

        return c;
    }

    public int subtask_2_for(int num) {
        int a = 0;
        int i = 1;

        for(int b = 1; b <= num; a = i++) {
            b += i;
        }

        return a;
    }

    public int subtask_3_for(int num, int d, int cnt) {
        int a = num;
        int a0 = num;

        for(int i = 1; i < cnt; ++i) {
            int an = a0 * d + 1;
            a0 = an;
            a += an;
        }

        return a;
    }

    public int subtask_4_for(int n) {
        int sn = 1;
        int a = 0;

        for(int i = 1; i <= n; ++i) {
            sn *= i;
            a += sn;
        }

        return a;
    }
}
